package io.growing.graphql

import io.growing.graphql.schema.GraphqlSchemaScanner

/**
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/8/14
 */
object GraphqlSchemaMergeApp extends App {
  override def main(args: Array[String]): Unit = {
    new GraphqlSchemaScanner().mergeGraphql()
  }

}
