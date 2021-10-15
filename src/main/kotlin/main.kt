import model.Person

fun main(args: Array<String>){
    println("Hello, World")

    val onur = Person("Onur")

    println("Name is ${onur.Name}")

    onur.Name="Sevket"

    println("Name is ${onur.Name}")

    onur.display()

    onur.displayWithLambda { ::printName }
}

fun printName(name:String){
    println(name)
}