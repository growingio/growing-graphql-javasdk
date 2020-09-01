package io.growing.graphql.util

import java.io.File

import org.objectweb.asm.{ ClassReader, ClassVisitor, FieldVisitor, Opcodes }

import scala.collection.mutable.ListBuffer

/**
 * get builder' fields as resolver's method parameter names
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/9/1
 */
object AsmUtils {

  /**
   * if Builder is exists, use build fields. Builder can replace the function of `getParameterNames`.
   * Builder was created by default config.
   *
   * @param clazz request
   */
  def getRequestBuilderFields(clazz: Class[_]): Seq[String] = {
    val cr = new ClassReader(clazz.getName)
    val innerClass = ListBuffer[String]()
    val innerClassFields = ListBuffer[String]()
    cr.accept(new ClassVisitor(Opcodes.ASM8) {
      override def visitInnerClass(name: String, outerName: String, innerName: String, access: Int): Unit = {
        val outName = outerName.replace(File.separator, ".")
        if (clazz.getName == outName) {
          innerClass.append(name)
        }
      }
    }, 0)

    if (innerClass.nonEmpty) {
      val cr = new ClassReader(innerClass.head)
      cr.accept(new ClassVisitor(Opcodes.ASM8) {
        override def visitField(access: Int, name: String, descriptor: String, signature: String, value: Any): FieldVisitor = {
          innerClassFields.append(name)
          super.visitField(access, name, descriptor, signature, value)
        }
      }, 0)
    }

    innerClassFields.toSeq //cross compile must use toSeq

  }

}
