package com.example.demo.component.result

import com.example.demo.dto.ResponseInfo

class EmptyResult(
    override val response: ResponseInfo
) : ComponentResult<Any>() {
    override val data: Any = Any()
}