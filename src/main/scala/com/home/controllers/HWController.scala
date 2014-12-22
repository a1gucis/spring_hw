package com.home.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{RequestMapping, ResponseBody}


/**
 * Created by a1gucis on 22/12/14.
 */
@Controller
class HelloWorldController {

  @RequestMapping(Array("/hello"))
  @ResponseBody
  def showHello = "helloworld"
}
