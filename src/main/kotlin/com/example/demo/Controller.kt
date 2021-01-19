package com.example.demo

import com.example.demo.component.data.ComponentData
import com.example.demo.component.data.EmptyData
import com.example.demo.component.resolver.ComponentResolver
import com.example.demo.dto.ResolvedComponentInfo
import com.example.demo.dto.ResponseInfo
import com.example.demo.response.ScreenResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val componentResolvers: List<ComponentResolver<out ComponentData>>
) {
    @GetMapping("/test")
    fun test(): ScreenResponse {
        val components = listOf(Pair("hello", "1.0"), Pair("failure", "1.0"), Pair("none", "1.0"))
        val resolvedComponents = components.map { component ->
            val name = component.first
            val version = component.second

            val resolver = componentResolvers.find { it.match(name, version) }

            val componentData = resolver?.let { resolver.resolve() } ?: run { EmptyData(ResponseInfo(500, "no resolver found")) }
            ResolvedComponentInfo(name, version, componentData)
        }

        return ScreenResponse(resolvedComponents)
    }

}