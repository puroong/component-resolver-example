package com.example.demo.component.resolver

import com.example.demo.component.result.HelloComponentResult
import com.example.demo.model.HelloDto
import com.example.demo.component.response.HttpResponse

class HelloComponentResolver : ComponentResolver<HelloComponentResult>() {
    override val name = "hello"
    override val version = "1.0"

    override fun resolve(): HelloComponentResult {
        val helloDto = HelloDto("hello", "message")
        return HelloComponentResult(helloDto, HttpResponse(200, "success"))
    }
}