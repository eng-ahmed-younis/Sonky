package org.example.sonky

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform