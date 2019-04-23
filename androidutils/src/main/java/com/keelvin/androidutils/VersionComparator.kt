package com.keelvin.androidutils

import java.util.regex.Pattern

class VersionComparator(private val actualVersion: String,
                        private val newVersion: String) {
    fun compare(): Boolean {
        val vals1 = actualVersion.split(".")
        val vals2 = newVersion.split(".")

        for ((index, element) in vals1.withIndex()) {
            if (Integer.valueOf(element) > Integer.valueOf(vals2[index])) {
                return true
            }

            if (Integer.valueOf(element) < Integer.valueOf(vals2[index])) {
                return false
            }
        }

        return true
    }
}