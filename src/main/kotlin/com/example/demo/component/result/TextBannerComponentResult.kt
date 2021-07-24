package com.example.demo.component.result

import com.example.demo.model.TextBanner
import com.example.demo.component.response.HttpResponse

class TextBannerComponentResult(
    override val data: TextBanner,
    override val httpResponse: HttpResponse
) : ComponentResult<TextBanner>()
