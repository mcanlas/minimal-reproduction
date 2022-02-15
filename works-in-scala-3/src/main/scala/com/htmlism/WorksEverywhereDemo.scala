package com.htmlism

import cats._
import cats.syntax.all._

object WorksEverywhereDemo extends App {
  generically[List]

  /**
   * Is using `pure` returning `A` different than returning `F.unit`? Does it enable a LUB opportunity?
   */
  def generically[F[_] : Monad]: F[Unit] =
    for {
      y <-
        if (true)
          { println("this works in scala 2.12.8 and 3.1.1"); 1 }.pure
        else
          ().pure
    } yield ()
}
