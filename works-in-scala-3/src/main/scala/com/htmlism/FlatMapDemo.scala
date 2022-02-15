package com.htmlism

import cats._
import cats.syntax.all._

object FlatMapDemo extends App {
  generically[List]

  /**
   * Is using `pure` returning `A` different than returning `F.unit`? Does it enable a LUB opportunity?
   */
  def generically[F[_] : Monad]: F[Unit] =
    for {
      x <- println(1).pure

      y <-
        if (true)
          { println("one"); 1 }.pure
        else
          ().pure
    } yield ()
}
