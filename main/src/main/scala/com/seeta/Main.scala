package com.seeta

import com.seeta.modules.{ Module1, Module2 }

object Main extends App with Module1 with Module2 {
  println("Hello, world!")
}
