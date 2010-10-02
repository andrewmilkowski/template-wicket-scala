package com.foo.myapp

import java.util.List

trait ProductService {
  def getAll: List[Product]
}