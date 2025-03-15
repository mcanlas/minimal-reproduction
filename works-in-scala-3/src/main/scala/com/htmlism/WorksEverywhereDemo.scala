package com.htmlism

import cats._
import cats.syntax.all._

object WorksEverywhereDemo extends App {
  val msg =
    "this works in scala 2.13.* and 3.6.0"

  generically[List]

  def generically[F[_]](implicit F: Applicative[F]): F[Unit] = {
    val confusingUpperBound =
      if (true)
        F.pure {
          println(msg)
          1
        }
      else
        F.pure(()) // this is the line that is different

    // uses extension method `map` over `F[_]`
    confusingUpperBound.void
  }
}
