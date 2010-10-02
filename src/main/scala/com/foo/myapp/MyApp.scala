
package com.foo.myapp

import org.apache.wicket.protocol.http.WebApplication
import com.ttdev.wicketpagetest.MockableSpringBeanInjector

class MyApp extends WebApplication {
  def getHomePage = classOf[MyPage]

  override def init = {
    MockableSpringBeanInjector.installInjector(this)
  }
}

