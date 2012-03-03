package jp.ac.waseda.cs.washi

/**
 * @author ${user.name}
 */
object ScalaApp {

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    val l = List(1, 2)
    println(l)
    println("concat arguments = " + foo(args))
    JavaApp.main(null);
  }

}
