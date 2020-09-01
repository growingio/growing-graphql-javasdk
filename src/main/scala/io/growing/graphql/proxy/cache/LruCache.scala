package io.growing.graphql.proxy.cache

import java.{ util => ju }

import scala.collection.JavaConverters._

/**
 * lru cache
 *
 * @author liguobin@growingio.com
 * @version 1.0,2020/9/1
 */
class LruCache[K, V](val maxSize: Int, val underlying: ju.Map[K, V]) extends Cache[K, V] {

  def this(maxSize: Int) = this(maxSize, LruCache.makeUnderlying[K, V](maxSize))

  override def put(key: K, value: V): Unit = {
    this.underlying.put(key, value)
  }

  override def get(key: K): Option[V] = {
    Option(this.underlying.get(key))
  }

  override def values(): Seq[V] = {
    this.underlying.values().asScala.toSeq
  }

  def contains(key: K): Boolean = {
    this.underlying.containsKey(key)
  }

  def clear(): Unit = {
    this.underlying.clear()
  }

}

object LruCache {

  // initial capacity and load factor are the normal defaults for LinkedHashMap
  def makeUnderlying[K, V](maxSize: Int): ju.Map[K, V] =
    new ju.LinkedHashMap[K, V](
      maxSize, /* initial capacity */
      0.75f, /* load factor */
      true /* access order (as opposed to insertion order) */
    ) {
      override protected def removeEldestEntry(eldest: ju.Map.Entry[K, V]): Boolean = {
        this.size() > maxSize
      }
    }
}