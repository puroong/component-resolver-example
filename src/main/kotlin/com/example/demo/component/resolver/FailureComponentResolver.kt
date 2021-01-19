package com.example.demo.component.resolver

import com.example.demo.component.data.FailureComponentData
import com.example.demo.dto.FailureDto
import com.example.demo.dto.ResponseInfo

class FailureComponentResolver : ComponentResolver<FailureComponentData>() {
    override val name = "failure"
    override val version = "1.0"

    override fun resolve(): FailureComponentData {
        val failureDto = FailureDto("failure", "message")
        return FailureComponentData(failureDto, ResponseInfo(403, "Forbidden"))
    }
}