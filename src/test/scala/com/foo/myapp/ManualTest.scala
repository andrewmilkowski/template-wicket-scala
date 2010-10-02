package com.foo.myapp

import com.ttdev.wicketpagetest.{WebAppJettyConfiguration, WicketAppJettyLauncher}

object ManualTest {
  def main(args: Array[String]) {
    val l = new WicketAppJettyLauncher
    l.startAppInJetty(new WebAppJettyConfiguration)

  }

}