package com.foo.myapp

import javax.persistence.{PersistenceContext, EntityManager}
import org.springframework.stereotype.Repository
import java.util.List

@Repository
class DefaultProducts extends Products {
  @PersistenceContext
  var em: EntityManager = _

  def getAll = {
    em.createQuery("select p from Product p").getResultList.asInstanceOf[List[Product]]
  }
}