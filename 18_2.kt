fun main()
{
    try{
        println("введите координаты M1(x1,y1)")
        val x1=readLine()!!.toDouble()
        val y1=readLine()!!.toDouble()
        println("введите координаты M2(x2,y2)")
        val x2=readLine()!!.toDouble()
        val y2=readLine()!!.toDouble()
        println("введите координаты N1(x3,y3)")
        val x3=readLine()!!.toDouble()
        val y3=readLine()!!.toDouble()
        println("введите координаты N2(x4,y4)")
        val x4=readLine()!!.toDouble()
        val y4=readLine()!!.toDouble()
        val k=(y2-y1)/(x2-x1)
        val kk=(y4-y3)/(x4-x3)
        if (k==kk) {
            println("прямые параллельны")
        }
        else {
            println("прямые не параллельны")
            val b=y1-k*x1
            val bb=y3-kk*x3
            val x=(bb-b)/(k-kk)
            val y=(k*x)+b
            if (((k*x)+b)==((kk*x)+bb))
            {
                println ("точка пересечения прямых:[${String.format("%.2f",x)};${String.format("%.2f",y)}]")
            }
            else {println("и не пересекаются")}
        }
    }
    catch (e: Exception)
    {
        println("error")
    }
}