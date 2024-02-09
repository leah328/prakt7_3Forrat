import kotlin.math.pow
fun main()
{
    try{
        val x: Double
        val y: Double
        println("введите а (a не должно быть 0)")
        val a=readLine()!!.toDouble()
        if (a>0||a<0) {
            println("введите b")
            val b=readLine()!!.toDouble()
            println("введите c")
            val c=readLine()!!.toDouble()
             x=(-b)/(2*a)
             y=((4*a*c)-b.pow(2))/(4*a)
            println("первая вершина = ${String.format("%.2f",x)}, вторая вершина = ${String.format("%.2f",y)}")
        }
        else {
            println("неверное значение а")
        }
    }
    catch (e: Exception)
    {
        println("error")
    }
}