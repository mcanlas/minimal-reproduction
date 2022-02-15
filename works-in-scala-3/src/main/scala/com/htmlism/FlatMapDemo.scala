package com.htmlism

import cats._
import cats.syntax.all._

object FlatMapDemo extends App {
  generically[List]

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
