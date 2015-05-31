package scalamde_user

import org.scalacheck.{Arbitrary, Gen, Properties}
import org.scalacheck.Prop.forAll


object UserProperties extends Properties("Propiedades de usuario"){

  val listaNombres = List("Ana", "Ana Mar�a", "Carlos", "Carlos Alberto", "Claudia Patricia", "Juan", "Luis",
    "Luis Alberto", "Luis Eduardo", "Luz", "Luz Marina", "Mar�a del Carmen", "Rosa", "Sandra", "Jorge", "Jos�",
    "Juan Carlos", "Luis Fernando", "Mar�a", "Mar�a Elena", "Santiago", "Valentina")

  val listaApellidos = List("D�as", "Garc�a", "G�mez", "Gonz�lez", "Hern�ndez", "Jim�nez", "L�pez", "Mart�nez",
    "Moreno", "Mu�oz", "P�rez", "Ram�rez", "Rodr�guez", "Rojas", "S�nchez")

  val usuariosGen: Gen[Usuario] = ???

  property("El tama�o del nombre completo es el tama�o del nombre + el tama�o del apellido + 1") =
    forAll{(usr: Usuario) =>
      usr.getNombreCompleto.length == usr.nombre.length + usr.apellido.length + 1
    }

  property("Un usuario mayor de de edad es todo el que tenga 18 o m�s a�os") =
    forAll{(usr: Usuario) =>
      usr.isMayorDeEdad == (usr.edad >= 18)
    }
}

