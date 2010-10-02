package com.foo.myapp

import javax.persistence.{GeneratedValue, Id, Entity}

@Entity
class Product {
  @Id
  @GeneratedValue
  var id: Long = _
  var name: String = _
  var price: Double = _
 
}