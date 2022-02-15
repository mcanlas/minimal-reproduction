package com.htmlism

import cats._
import cats.syntax.all._

object WorksInScala2Only extends App {
  generically[List]

  def generically[F[_]](implicit F: Monad[F]): F[Unit] =
    for {
      y <-
        if (true)
          F.pure {
            println("this works in scala 2.12.8 ONLY")
            1
          }
        else
          F.unit
    } yield ()
}
