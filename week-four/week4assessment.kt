fun main() {

    println(result)

    println(result2)

    println(result3)

}
fun evenSpaced(a:Int,b:Int,c:Int):Boolean{
    val sum:Int=a+b+c
    return if (sum%3!=0) {
        false
    }else !(sum/3!=a && sum/3!=b && sum/3!=c)


}
var result=evenSpaced(2,4,6)
var result2=evenSpaced(4,6,2)
var result3=evenSpaced(4,6,3)

