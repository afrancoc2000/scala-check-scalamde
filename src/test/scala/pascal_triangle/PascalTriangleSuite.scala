package pascal_triangle

import org.scalacheck.Prop.{BooleanOperators, forAll}
import org.scalacheck.{Gen, Properties}
import pascal_triangle.PascalTriangle._

object PascalTriangleProperties extends Properties("Pascal Triangle") {

  val validNumbers = for (n <- Gen.choose(0, 1000)) yield n

  property("El primer valor en todas las filas siempre es 1") = ???

  property("El ultimo valor en todas las filas siempre es 1") = ???

  property("Cualquier valor fuera del triángulo es 0") = ???

  property("Cualquier valor dentro del triángulo es igual a la suma de sus 2 valores superiores") = ???

}
