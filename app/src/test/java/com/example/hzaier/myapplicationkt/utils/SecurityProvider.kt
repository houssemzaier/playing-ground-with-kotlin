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
            val provider = iterator.next();
            println(provider.name)
            provider.forEach { key, value -> println("\t$key: $value") }
        }
    }

    fun getAllProviders(): List<ProviderDetails> {
        return getProviders().flatMap { provider ->
            provider.entries.filter { it -> it.key.toString().contains("JAVA", true) }
                    .map { ProviderDetails(provider.name, it.key.toString()) }
        }
    }

    fun mapAllProvidersToProviderDetails(): List<ProviderDetails> {
        return getProviders().map { provider -> ProviderDetails(provider.name, "") }
    }

    fun mapAllProviders() {
        getProviders().forEach { provider ->
            println(provider.name)
            provider.map { ProviderDetails(provider.name, provider.name.toString()) }
        }

    }
}

class ProviderDetails(name: String?, toString: String)