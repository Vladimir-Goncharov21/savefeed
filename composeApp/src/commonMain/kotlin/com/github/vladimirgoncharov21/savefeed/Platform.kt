package com.github.vladimirgoncharov21.savefeed

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform