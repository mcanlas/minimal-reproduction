package com.htmlism

import cats._
import cats.syntax.all._

object WorksEverywhereDemo extends App {
  val msg =
    "this works in scala 2.12.8 and 3.1.1"

  generically[List]

  def generically[F[_]](implicit F: Monad[F]): F[Unit] = {
    val confusingUpperBound =
      if (true)
        F.pure {
          println(msg)
          1
        }
      else
        F.pure(())

    // uses extension method `map` over `F[_]`
    confusingUpperBound.void
  }
}
