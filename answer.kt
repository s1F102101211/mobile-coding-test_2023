fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    for(i in 1..n){
        print(" ".repeat(n - i))
        for(j in 1..i) print(j)
        for(j in (i-1) downTo 1) print(j)
        println()
    }
}