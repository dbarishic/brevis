package com.dbarishic.brevis.extensions

// 00, .. , 09, 0a, .. , 0z, .. , 0A, .. , 0Z, 000
fun String.generateNextPermutation(): String {
    var lastChar = this[this.length - 1]
    val lastCharRemoved = this.substring(0, this.length - 1)

    return when (lastChar) {
        '9' -> lastCharRemoved + 'a'
        'z' -> lastCharRemoved + 'A'
        'Z' -> if (this.length > 1) lastCharRemoved.generateNextPermutation() + '0' else return "00"
        else -> lastCharRemoved + ++lastChar
    }
}
