package com.example.demo

import com.example.demo.component.data.ComponentData
import com.example.demo.component.resolver.ComponentResolver
import com.example.demo.component.resolver.FailureComponentResolver
import com.example.demo.component.resolver.HelloComponentResolver
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {
    @Bean
    fun componentResolvers(): List<ComponentResolver<out ComponentData>> {
        return listOf(
            HelloComponentResolver(),
            FailureComponentResolver()
        )
    }
}