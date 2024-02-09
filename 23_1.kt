
fun main()
{
    try{
        val l: Double
        val p: Double
        println("введите радиус окружности")
        val r=readLine()!!.toDouble()
        if (r>0) {
            l=2*3.14*r
            p=(2*r)*4
            println("l=${String.format("%.2f",l)}, P=${String.format("%.2f",p)}")
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