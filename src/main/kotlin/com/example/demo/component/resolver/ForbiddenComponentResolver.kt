package com.example.demo.component.resolver

import com.example.demo.component.result.ForbiddenComponentResult
import com.example.demo.model.ForbiddenModel
import com.example.demo.component.response.HttpResponse
import com.example.demo.vo.Version

class ForbiddenComponentResolver : ComponentResolver<ForbiddenComponentResult>() {
    override val name = "forbidden"
    override val version = Version(1, 0);

    override fun resolve(): ForbiddenComponentResult {
        val data = ForbiddenModel("hello")
        return ForbiddenComponentResult(data, HttpResponse(403, "무조건 403 에러가 발생합니다"))
    }
}