package com.example.demo

import com.example.demo.component.result.ComponentResult
import com.example.demo.component.resolver.ComponentResolver
import com.example.demo.component.resolver.FailureComponentResolver
import com.example.demo.component.resolver.HelloComponentResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {
    @Bean
    fun componentResolvers(): List<ComponentResolver<out ComponentResult<out Any>>> {
        return listOf(
            HelloComponentResolver(),
            FailureComponentResolver()
        )
    }
}