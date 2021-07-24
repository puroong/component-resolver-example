package com.example.demo.component.result

import com.example.demo.dto.ResponseInfo

abstract class ComponentResult<D> {
    abstract val data: D
    abstract val response: ResponseInfo
}
