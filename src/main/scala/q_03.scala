/*  3. Write a Scala program which defines a method named "toUpper" and it accepts a String as
input parameter that is then formatted to upper case as output. Define another method named
"toLower'' which accepts a String as input parameter and formats the input to lower case as
output. Define another method named "formatNames" which also has an input String called
"name". This method however has a parameter group which accepts a function with an input of
type String and also outputs a String. This particular function will be used to apply the given
format to the "name" input. You can use the test inputs for, say, "Benny", "Niroshan", "Saman"
“Kumara”, and make sure that the output is as shown below.
Output:
        BENNY
        NIroshan
        saman
        KumarA
*/

import scala.io.StdIn
object q_03 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", str => str.toUpperCase))
    println(formatNames("Ni", str => str.toUpperCase) + formatNames("roshan", str => str.toLowerCase))
    println(formatNames("Saman", str => str.toLowerCase))
    println(formatNames("K", str => str.toUpperCase) + formatNames("umar", str => str.toLowerCase) + formatNames("a", str => str.toUpperCase))
  }

  val toUpper: String => String = my_string => my_string.map { c =>
    if (c.isLower) c.toUpper else c
  }

  val toLower: String => String = my_string => my_string.map { c =>
    if (c.isUpper) c.toLower else c
  }

  def formatNames(name: String, format_func: String => String): String = {
    format_func(name)
  }
}
