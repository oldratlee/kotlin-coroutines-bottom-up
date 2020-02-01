package com.oldratlee.demo.koroutines_bottom_up.client.services

import com.oldratlee.demo.koroutines_bottom_up.client.addThreadId
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import tornadofx.Controller
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


interface WaldoFinder {
    suspend fun wheresWaldo(starterName: String): String
}


class HttpWaldoFinder : Controller(), WaldoFinder {
    override suspend fun wheresWaldo(starterName: String): String {
        val firstName = fetchNewName(starterName)
        println("Found $firstName name".addThreadId())

        val secondName = fetchNewName(firstName)
        println("Found $secondName name".addThreadId())

        val thirdName = fetchNewName(secondName)
        println("Found $thirdName name".addThreadId())

        val fourthName = fetchNewName(thirdName)
        println("Found $fourthName name".addThreadId())

        return fetchNewName(fourthName)
    }

    private suspend fun fetchNewName(inputName: String): String {
        val url = URI("http://localhost:8080/wheresWaldo/$inputName")
        val client = HttpClient.newBuilder().build()
        val handler = HttpResponse.BodyHandlers.ofString()
        val request = HttpRequest.newBuilder().uri(url).build()

        return withContext<String>(Dispatchers.IO) {
            println("Sending HTTP Request for $inputName".addThreadId())
            client
                    .send(request, handler)
                    .body()
        }
    }
}
