package com.example.demo.component.result

import com.example.demo.model.HelloDto
import com.example.demo.component.response.HttpResponse

class HelloComponentResult(
    override val data: HelloDto,
    override val httpResponse: HttpResponse
) : ComponentResult<HelloDto>()