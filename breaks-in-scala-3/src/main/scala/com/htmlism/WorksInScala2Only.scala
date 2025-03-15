package com.htmlism

import cats._
import cats.syntax.all._

object WorksInScala2Only extends App {
  val msg =
    "this works in scala 2.12.8 ONLY"

  generically[List]

  def generically[F[_]](implicit F: Monad[F]): F[Unit] = {
    val confusingUpperBound =
      if (true)
        F.pure {
          println(msg)
          1
        }
      else
        F.unit // this is the line that is different

    // uses extension method `map` over `F[_]`
    confusingUpperBound.void
  }
}
