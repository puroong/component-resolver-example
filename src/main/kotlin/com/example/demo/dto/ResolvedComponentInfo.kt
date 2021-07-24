package com.example.demo.dto

import com.example.demo.component.result.ComponentResult
import com.fasterxml.jackson.annotation.JsonUnwrapped

class ResolvedComponentInfo(
    val name: String,
    val version: String,
    @JsonUnwrapped val componentResult: ComponentResult<out Any>
)