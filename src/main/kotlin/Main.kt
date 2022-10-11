import java.util.*

fun main(args: Array<String>) {
    //1
    val myAge:Int=18
    val isTeenager:Boolean = myAge >= 13 && myAge <= 19
    println(isTeenager)
//2
    val theirAge:Int=30
    val bothTeenagers:Boolean = theirAge >= 13 && theirAge <= 19 && isTeenager
    println(bothTeenagers)
//3
    val reader:String="Ангелина Харченко"
    val author:String="Richard Lucas"
    val authorIsReader:Boolean=reader==author
    println(authorIsReader)
//4
    val readerBeforeAuthor = reader<author
    println(readerBeforeAuthor)
//5
    val myAge2:Int=18
    if (myAge2>=13 && myAge2<=19)
        println("Подросток")
    else println("He подросток")
//6
    val answer = if (myAge2>=13 && myAge2<=19) "Подросток" else "He подросток"
    println(answer)
//7
    var counter:Int=0
    while (counter<10)
    {
        println(counter)
        counter+=1
    }
//8
    counter=0
    var roll:Int=0
    do
    {
        roll= Random().nextInt(6)
        counter+=1
        println ("После $counter бросков, roll равен $roll")
    }
    while (roll!=0)
//9
    val range = 1..10
    for (i in range)
        println (i*i)
//10
    for (i in range)
        println(Math.sqrt(i.toDouble()))
//11
    var sum:Int = 0
    for (row in 1  until 8 step 2)
    {
        for (column in 0 until 8)
        {
            sum += row * column
        }
    }
    println("Результат: $sum")
}