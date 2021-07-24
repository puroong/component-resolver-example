package com.example.demo.component.result

import com.example.demo.dto.HelloDto
import com.example.demo.dto.ResponseInfo

class HelloComponentResult(
    override val data: HelloDto,
    override val response: ResponseInfo
) : ComponentResult<HelloDto>()