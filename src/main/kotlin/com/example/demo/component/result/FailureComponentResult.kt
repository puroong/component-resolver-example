package com.example.demo.component.result

import com.example.demo.dto.FailureDto
import com.example.demo.component.response.HttpResponse

class FailureComponentResult(
    override val data: FailureDto,
    override val httpResponse: HttpResponse
) : ComponentResult<FailureDto>()
