import scala.io.StdIn.readLine
object practical_7{
    def main(args: Array[String]):Unit = {
        val input = readLine("Enter the numbers saperated by spaces : ")
        val inputlist= input.split(" ").map(_.toInt).toList
        val newList = filterEvenNumbers(inputlist)
        println("The even numbers are")
        println(newList)

        val input_square = readLine("Enter the numbers saperated by spaces : ")
        val inputlist_square= input_square.split(" ").map(_.toInt).toList
        val newList_square = calculateSquare(inputlist_square)
        println("The square numbers for Entered numbers are = ")
        println(newList_square)
        val input_numbers = readLine("Enter the numbers saperated by spaces : ")
        val inputlist_forPrime= input_square.split(" ").map(_.toInt).toList
        val newList_prime = filterPrime(inputlist_square)
        println("The prime numbers among entered numbers are = ")
        println(newList_prime)


    }
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(n => n%2 ==0)

    }
    def calculateSquare(numbers : List[Int]): List[Int]={
        numbers.map(n => n*n)
    }
    def isPrime(num: Int): Boolean = {
        if (num <= 1) false
        else if (num == 2) true
        else !(2 to math.sqrt(num).toInt).exists(n => num % n == 0)
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(num => 
        if (num <= 1) false
        else if (num == 2) true
        else !(2 to math.sqrt(num).toInt).exists(n => num % n == 0)
        )
    }
}