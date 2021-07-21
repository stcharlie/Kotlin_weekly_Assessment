fun main(args: Array<String>) {
    reverseArrayNum(5488624)




    
}
fun reverseArrayNum(number: Int) {
    var sampleInt: Int = number
    val reverseNum = ArrayList<Int>()
    do {
        reverseNum.add(sampleInt % 10)
        sampleInt /= 10
    } while (sampleInt > 0)
    println(reverseNum)
}