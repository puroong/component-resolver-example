package com.example.demo.component.result

import com.example.demo.component.response.HttpResponse

class EmptyResult(
    override val httpResponse: HttpResponse
) : ComponentResult<Any>() {
    override val data: Any = Any()
}
