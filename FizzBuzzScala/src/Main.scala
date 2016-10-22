object Main {
  def main(args: Array[String]): Unit = {

    def prompt(s: String) = {
      println(s)
      io.StdIn.readLine()
    }

    val start: Int = prompt("Please enter start number").toInt
    val end: Int = prompt(("Please enter end number")).toInt

    (start to end).foreach(x => {
      x match {
        case n if n % 15 == 0 => println("FizzBuzz")
        case n if n % 5 == 0 => println("Buzz")
        case n if n % 3 == 0 => println("Fizz")
        case _ => println(x)
      }
    })
  }
}
