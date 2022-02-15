package com.htmlism

import cats.effect._
import cats.syntax.all._

object FlatMapDemo extends IOApp.Simple {
  def run: IO[Unit] =
    generically[IO]

  def generically[F[_]](implicit F: Sync[F]) =
    for {
      x <- F.delay(println(1))

      _ <-
        if (false)
          F.delay(println("one"))
        else
          F.delay(println("two"))
    } yield ()
}
