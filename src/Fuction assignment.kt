import java.security.KeyStore

fun main() {
    var name:String="Hello Audrey"
    println(name)

    var result=modulus(67,5)
    println(result)

    var reSult=addition(30,400,500,267)
    println(reSult)

    var tall:Boolean=true
    println(tall)


}
fun modulus(num1:Int,num2:Int):Int {
    var modulus=num1%num2
    return modulus

}
fun addition(no1:Int,no2:Int,no3:Int,no4:Int):Int {
    var sum=no1+no2+no3+no4
    return sum

}

