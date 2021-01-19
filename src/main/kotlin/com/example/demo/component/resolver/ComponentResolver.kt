package com.example.demo.component.resolver

import com.example.demo.component.data.ComponentData

abstract class ComponentResolver<R: ComponentData> {
    abstract val name: String
    abstract val version: String

    fun match(name: String, version: String): Boolean {
        return this.name.equals(name) && this.version.equals(version)
    }

    abstract fun resolve(): R
}