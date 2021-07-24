package com.example.demo.component.resolver

import com.example.demo.component.result.ForbiddenComponentResult
import com.example.demo.model.ForbiddenModel
import com.example.demo.component.response.HttpResponse

class ForbiddenComponentResolver : ComponentResolver<ForbiddenComponentResult>() {
    override val name = "forbidden"
    override val version = "1.0"

    override fun resolve(): ForbiddenComponentResult {
        val data = ForbiddenModel("hello")
        return ForbiddenComponentResult(data, HttpResponse(403, "무조건 403 에러가 발생합니다"))
    }
}