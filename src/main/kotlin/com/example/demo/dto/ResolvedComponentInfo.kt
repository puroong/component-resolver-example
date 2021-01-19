package com.example.demo.dto

import com.example.demo.component.data.ComponentData
import com.fasterxml.jackson.annotation.JsonUnwrapped

class ResolvedComponentInfo(
    val name: String,
    val version: String,
    @JsonUnwrapped val componentData: ComponentData
)