import kotlin.math.*
fun main()
{
    try{
        val p: Double
        val s: Double
        println("введите а")
        val a=readLine()!!.toDouble()
        println("введите b")
        val b=readLine()!!.toDouble()
        println("введиту c")
        val c=readLine()!!.toDouble()
        if (a>0&&b>0&&c>0) {
            if ((a + b) > c || (a + c) > b || (c + b) > a) {
                p = a + b + c
                val pp = p / 2
                s = sqrt(pp * (pp - a) * (pp - b) * (pp - c))
                println("P = ${String.format("%.2f", p)}, S = ${String.format("%.2f", s)}")
            } else {
                println("такого треугольника не существует")
            }
        }
        else {println("введенное значение должно быть больше нуля")}
    }
    catch (e: Exception)
    {
        println("error")
    }
}