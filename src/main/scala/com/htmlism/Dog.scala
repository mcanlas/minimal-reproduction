package com.htmlism

// applied correctly in 2.13, but not 3.7
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments"))
final case class Dog(name: String = "abc")
