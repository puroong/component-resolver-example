package com.example.demo.component.resolver

import com.example.demo.component.result.ComponentResult
import org.springframework.stereotype.Component

@Component
abstract class ComponentResolver<R: ComponentResult<out Any>> {
    abstract val name: String
    abstract val version: String

    fun match(name: String, version: String): Boolean {
        return this.name.equals(name) && this.version.equals(version)
    }

    abstract fun resolve(): R
}