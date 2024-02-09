import kotlin.math.*
fun main()
{
    try{
        val s: Double
        val r: Double
        val rr: Double
        println("введите сторону равностороннего треугольника")
        val a=readLine()!!.toDouble()
        if (a>0) {
            s=(sqrt(3.0)/4)*a.pow(2)
            r= (a*sqrt(3.0))/6
            rr=(a*sqrt(3.0))/3
            println("S=${String.format("%.2f",s)}, радиус вписанной окр.=${String.format("%.2f",r)}, радиус описанной окр.=${String.format("%.2f",rr)}")
        }
        else {
            println("введенное значение должно быть больше нуля")
        }
    }
    catch (e: Exception)
    {
        println("error")

    }
}