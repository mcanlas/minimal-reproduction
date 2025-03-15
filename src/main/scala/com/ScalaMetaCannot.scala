package com

import scala.meta.*

object ScalaMetaCannot extends App:
  val program =
    """
  package object com:
    val xs =
      List()
        .map:
          case a =>
            a
  """

  given Dialect =
    dialects.Scala3

  // only works with 4.12.6
  // not with 4.12.7
  val tree =
    program.parse[Source].get

  println(tree.syntax)
