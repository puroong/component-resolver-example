package com.example.demo.component.resolver

import com.example.demo.component.result.HelloComponentResult
import com.example.demo.dto.HelloDto
import com.example.demo.dto.ResponseInfo

class HelloComponentResolver : ComponentResolver<HelloComponentResult>() {
    override val name = "hello"
    override val version = "1.0"

    override fun resolve(): HelloComponentResult {
        val helloDto = HelloDto("hello", "message")
        return HelloComponentResult(helloDto, ResponseInfo(200, "success"))
    }
}