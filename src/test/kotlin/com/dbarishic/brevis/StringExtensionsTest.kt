package com.dbarishic.brevis

import com.dbarishic.brevis.extensions.generateNextPermutation
import org.junit.jupiter.api.Test

class StringExtensionsTest {

    @Test
    fun `generateNextPermutation returns correct permutation`() {
        val result = "aaa".generateNextPermutation()
        assert(result == "aab")
    }

    @Test
    fun `generateNextPermutation goes from 9 to 'a'`() {
        val result = "999".generateNextPermutation()
        assert(result == "99a")
    }

    @Test
    fun `generateNextPermutation goes from 'z' to 'A'`() {
        val result = "zzz".generateNextPermutation()
        assert(result == "zzA")
    }

    @Test
    fun `generateNextPermutation goes from 3char to 4char when max 3char value reached`() {
        val result = "ZZZ".generateNextPermutation()
        assert(result == "0000")
    }
}