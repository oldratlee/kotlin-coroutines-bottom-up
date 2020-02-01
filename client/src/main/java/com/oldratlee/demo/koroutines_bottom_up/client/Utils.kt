package com.oldratlee.demo.koroutines_bottom_up.client

fun String.addThreadId() = "$this on thread ${Thread.currentThread().id}"
