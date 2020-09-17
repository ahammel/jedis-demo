import redis.clients.jedis.Jedis

fun main(args: Array<String>) {
    Jedis("localhost")
        .apply { set("foo", "bar") }
        .get("foo")
        .let { println(it) }
}