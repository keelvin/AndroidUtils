package com.keelvin.androidutils

import org.junit.Assert
import org.junit.Test

class VersionComparatorTest {

    @Test
    fun `versoes iguais deve retornar true`() {
        Assert.assertTrue(VersionComparator("1.0.0.0", "1.0.0.0").compare())
    }

    @Test
    fun `versao atual maior que versao vigente deve retornar true`() {
        Assert.assertTrue(VersionComparator("2.0.2.0", "2.0.1.3").compare())
    }

    @Test
    fun `versao 1010 comparando com versao 1000 deve retornar true`() {
        Assert.assertTrue(VersionComparator("1.0.1.0", "1.0.0.0").compare())
    }

    @Test
    fun `versao 99910 comparando com versao 9999 deve retornar true`() {
        Assert.assertTrue(VersionComparator("9.9.9.10", "9.9.9.9").compare())
    }

    @Test
    fun `versao requerida maior que versao atual deve retornar false`() {
        Assert.assertFalse(VersionComparator("2.0.1.3", "2.0.2.0").compare())
    }
}