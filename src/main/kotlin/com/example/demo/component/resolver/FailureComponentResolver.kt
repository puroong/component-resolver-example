package com.example.demo.component.resolver

import com.example.demo.component.result.FailureComponentResult
import com.example.demo.dto.FailureDto
import com.example.demo.dto.ResponseInfo

class FailureComponentResolver : ComponentResolver<FailureComponentResult>() {
    override val name = "failure"
    override val version = "1.0"

    override fun resolve(): FailureComponentResult {
        val failureDto = FailureDto("failure", "message")
        return FailureComponentResult(failureDto, ResponseInfo(403, "Forbidden"))
    }
}