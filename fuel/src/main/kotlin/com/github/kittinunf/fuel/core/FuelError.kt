package com.github.kittinunf.fuel.core

import kotlin.properties.Delegates

class FuelError : Exception() {
    var exception: Exception by Delegates.notNull()
    var errorData = ByteArray(0)
    var response = Response()

    override fun toString(): String = "Exception : ${exception.message}"
}
