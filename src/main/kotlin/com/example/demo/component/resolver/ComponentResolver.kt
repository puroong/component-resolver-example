package com.example.demo.component.resolver

import com.example.demo.component.result.ComponentResult
import com.example.demo.vo.Version
import org.springframework.stereotype.Component

@Component
abstract class ComponentResolver<R: ComponentResult<out Any>> {
    abstract val name: String
    abstract val version: Version

    fun match(name: String, version: Version): Boolean {
        return this.name.equals(name) && this.version.equals(version)
    }

    abstract fun resolve(): R
}