package io.growing.graphql.schema

import java.io.{ BufferedWriter, File, FileWriter }

import com.google.common.reflect.ClassPath

/**
 * 将schema转成标准的graphql格式
 */
trait ScannerSupport {
  scanner: GraphqlSchemaScanner =>

  def mergeGraphql(classPath: ClassPath = ClassPath.from(this.getClass.getClassLoader), root: String = "graphql"): Unit = {
    import java.time.{ LocalDateTime, ZoneId }
    val file = new File("src/main/resources/all.graphqls")
    if (file.exists()) {
      file.delete()
    }
    val schema: String = scanner.scanSchema(classPath, root)
    val date = LocalDateTime.now(ZoneId.of("Asia/Shanghai"))
    file.createNewFile()
    val fw = new FileWriter(file)
    val bw = new BufferedWriter(fw)
    bw.write(s"# Created automatically at $date. Don't modify it\n")
    bw.write(schema)
    bw.flush()
    println("all.graphqls file has been created automatically")
  }
}
