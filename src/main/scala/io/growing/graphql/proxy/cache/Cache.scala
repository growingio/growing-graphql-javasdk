package io.growing.graphql.proxy.cache

/**
 * cache
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/9/1
 */
trait Cache[K, V] {

  def get(key: K): Option[V]

  def put(key: K, value: V): Unit

  def values(): Seq[V]

}