
data class Shape(private var a : Int,private var b : Int){
    public fun setA (a : Int) : Unit{
        this.a = a;
    }
    public fun getA() : Int{
        return this.a;
    }
}


fun main(args: Array<String>) {
    var testNull : Int?;
    var shape = Shape(1,1)
    shape.setA(2);
    println(shape.getA())
    var a  = 123
    val b = 1234;
    print(a);
    println(b);
    print(a);
    val c = '1'
    println(c);
    println("${b + 1}");

}