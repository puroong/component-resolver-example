package com.example.demo.component.result

import com.example.demo.component.response.HttpResponse

abstract class ComponentResult<D> {
    abstract val data: D
    abstract val httpResponse: HttpResponse
}
