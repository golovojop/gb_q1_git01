object Main extends App {
    println("Hello All")

    val message = "My name is Sergey"

    val arr = message.split(' ').toArray

    arr.foreach(println(_))
}