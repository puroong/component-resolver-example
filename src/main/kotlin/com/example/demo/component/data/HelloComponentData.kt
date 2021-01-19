package com.example.demo.component.data

import com.example.demo.dto.ResponseInfo

class HelloComponentData(
    override val data: Any,
    override val response: ResponseInfo
) : ComponentData()