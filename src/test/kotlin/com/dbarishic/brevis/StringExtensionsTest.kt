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

    @Test
    fun `generateNextPermutation generates all unique permutations for 3char string`() {
        val results = ArrayList<String>()
        var s = "000"
        var len = s.length
        results.add(s)

        while (len < 4) {
            s = s.generateNextPermutation()
            results.add(s)
            len = s.length
        }

        // subtract one because on last iteration a 4char string is added
        assert(results.distinct().count() -1 == 238328)
        assert(results.size - 1 == 238328)
    }
}