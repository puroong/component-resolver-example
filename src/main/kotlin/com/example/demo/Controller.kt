package com.example.demo

import com.example.demo.component.result.ComponentResult
import com.example.demo.component.result.EmptyResult
import com.example.demo.component.resolver.ComponentResolver
import com.example.demo.component.response.ComponentResponse
import com.example.demo.component.response.HttpResponse
import com.example.demo.response.ScreenResponse
import com.example.demo.vo.Version
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller(
    private val componentResolvers: List<ComponentResolver<out ComponentResult<out Any>>>
) {
    @GetMapping("/test")
    fun test(): ScreenResponse {
        val components = listOf(Pair("forbidden", Version(1, 0)), Pair("text_banner", Version(1, 0)), Pair("none", Version(1, 0)))
        val resolvedComponents = components.map { component ->
            val name = component.first
            val version = component.second

            val resolver = componentResolvers.find { it.match(name, version) }

            val componentData = resolver?.let { resolver.resolve() } ?: run { EmptyResult(HttpResponse(500, "no resolver found")) }
            ComponentResponse(name, version, componentData)
        }

        return ScreenResponse(resolvedComponents)
    }

}