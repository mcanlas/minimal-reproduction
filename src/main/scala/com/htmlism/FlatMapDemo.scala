package com.htmlism

import cats.effect._
import cats.syntax.all._

object FlatMapDemo extends IOApp.Simple {
  def run: IO[Unit] =
    generically[IO]

  def generically[F[_]](implicit F: Sync[F]): F[Unit] =
    for {
      x <- F.delay(println(1))

      y <-
        if (true)
          F.delay {
            println("one")
            1
          }
        else
          F.unit
    } yield ()
}
