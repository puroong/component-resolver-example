package com.example.demo.component.resolver

import com.example.demo.component.result.TextBannerComponentResult
import com.example.demo.model.TextBanner
import com.example.demo.component.response.HttpResponse
import com.example.demo.vo.Version

class TextBannerComponentResolver : ComponentResolver<TextBannerComponentResult>() {
    override val name = "text_banner"
    override val version = Version(1, 0)

    override fun resolve(): TextBannerComponentResult {
        val data = TextBanner("https://google.com", "구글 배너")
        return TextBannerComponentResult(data, HttpResponse(200, "조회 성공"))
    }
}