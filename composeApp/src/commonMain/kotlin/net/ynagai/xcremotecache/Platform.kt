package net.ynagai.xcremotecache

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform