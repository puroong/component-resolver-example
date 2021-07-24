package com.example.demo.component.response

import com.example.demo.component.result.ComponentResult
import com.fasterxml.jackson.annotation.JsonUnwrapped

class ComponentResponse(
    val name: String,
    val version: String,
    @JsonUnwrapped val componentResult: ComponentResult<out Any>
)