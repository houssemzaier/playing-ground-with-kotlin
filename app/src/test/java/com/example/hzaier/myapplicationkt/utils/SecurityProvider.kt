package com.example.hzaier.myapplicationkt.utils;

import java.security.Provider
import java.security.Security

/**
 * Created by houssem on 24/10/2017.
 */

class SecurityProvider() {
    fun getProviders(): List<Provider> {
        return Security.getProviders().asList()
    }

    fun printProviders() {
        for (provider in getProviders()) {
            println("name of the provider is: ${provider.name}")
        }

    }
    fun printProvidersIterator() {
        val iterator = getProviders().iterator()
        while (iterator.hasNext()) {
            val provider= iterator.next();
            println(provider.name)
            provider.forEach{key,value -> println("\t$key: $value")}
        }
    }
}
