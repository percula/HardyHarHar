package dev.percula.hardyharhar.model

import dev.percula.hardyharhar.DateSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

/**
 * This object represents an array with all exported HTTP requests.
 *
 * @see [specification](http://www.softwareishard.com/blog/har-12-spec/.entries)
 */
@Serializable
data class HarEntry(
    @SerialName("pageref") val pageref: String? = null,
    @SerialName("startedDateTime") @Serializable(with = DateSerializer::class) val startedDateTime: Date?,
    @SerialName("time") val time: Long,
    @SerialName("request") val request: HarRequest,
    @SerialName("response") val response: HarResponse,
    @SerialName("cache") val cache: HarCache? = null,
    @SerialName("timings") val timings: HarTimings? = null,
    @SerialName("serverIPAddress") val serverIPAddress: String? = null,
    @SerialName("connection") val connection: String? = null,
    @SerialName("comment") val comment: String? = null
) {
    override fun toString(): String {
        return "HarEntry [response = $response, connection = $connection, time = $time, pageref = $pageref, cache = $cache, timings = $timings, request = $request, comment = $comment, serverIPAddress = $serverIPAddress, startedDateTime = $startedDateTime]"
    }
}