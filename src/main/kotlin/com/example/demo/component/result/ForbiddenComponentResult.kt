package com.example.demo.component.result

import com.example.demo.model.ForbiddenModel
import com.example.demo.component.response.HttpResponse

class ForbiddenComponentResult(
    override val data: ForbiddenModel,
    override val httpResponse: HttpResponse
) : ComponentResult<ForbiddenModel>()