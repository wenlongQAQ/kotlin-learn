
data class Shape(private var a : Int,private var b : Int){
    public fun setA (a : Int) : Unit{
        this.a = a;
    }
    public fun getA() : Int{
        return this.a;
    }
}


fun main(args: Array<String>) {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val key : String = "a";
    println(map[key])

}