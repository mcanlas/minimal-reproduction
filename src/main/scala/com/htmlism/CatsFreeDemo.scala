package com.htmlism

import cats._
import cats.syntax.all._

object FlatMapDemo extends App {
  generically[List]

  def generically[F[_]](implicit F: Monad[F]): F[Unit] =
    for {
      x <- F.pure(println(1))

      y <-
        if (true)
          F.pure {
            println("one")
            1
          }
        else
          F.unit
    } yield ()
}
