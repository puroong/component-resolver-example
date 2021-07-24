package com.example.demo.component.result

import com.example.demo.dto.FailureDto
import com.example.demo.dto.ResponseInfo

class FailureComponentResult(
    override val data: FailureDto,
    override val response: ResponseInfo
) : ComponentResult<FailureDto>()
