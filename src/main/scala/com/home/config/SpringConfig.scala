package com.home.config

import com.home.controllers.HelloWorldController
import org.springframework.context.annotation.{Lazy, Configuration, Bean}
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport

/**
 * Created by a1gucis on 22/12/14.
 */
@Configuration
class SpringConfig extends WebMvcConfigurationSupport {

  @Lazy
  @Bean
  def hwController = new HelloWorldController
}