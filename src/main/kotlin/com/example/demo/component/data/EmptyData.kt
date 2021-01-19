package com.example.demo.component.data

import com.example.demo.dto.ResponseInfo
import java.util.*

class EmptyData(
    override val response: ResponseInfo
) : ComponentData() {
    override val data: Any = Any()
}