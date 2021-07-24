package com.example.demo.component.response

import com.example.demo.component.result.ComponentResult
import com.example.demo.vo.Version
import com.fasterxml.jackson.annotation.JsonUnwrapped

class ComponentResponse(
    val name: String,
    val version: Version,
    @JsonUnwrapped val componentResult: ComponentResult<out Any>
)