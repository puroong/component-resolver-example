package com.example.demo.component.resolver

import com.example.demo.component.data.HelloComponentData
import com.example.demo.dto.HelloDto
import com.example.demo.dto.ResponseInfo

class HelloComponentResolver : ComponentResolver<HelloComponentData>() {
    override val name = "hello"
    override val version = "1.0"

    override fun resolve(): HelloComponentData {
        val helloDto = HelloDto("hello", "message")
        return HelloComponentData(helloDto, ResponseInfo(200, "success"))
    }
}