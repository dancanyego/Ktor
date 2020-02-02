package com.danny.webapp

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

const val Home = "/"

fun Route.home() {
    get(Home) {
        call.respondText { "Hello , Ktor!!" }
    }
}