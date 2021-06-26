package Kotlin_Resource


fun main(){
    //  Numbers:-----
    /*
        Short:
            Size 2 Bytes
            Range -32768 to 32767
    */
    val a:Short = 12
    println("Short Type Value = $a")
    /*
        Byte:
            Size 1 Byte
            Range -128 to 127
     */
    val b:Byte = 120
    println("Byte Type Value = $b")
    /*
        Int:
            Size 4 Bytes
            Range  -2147483648 to 2147483647
    */
    val c:Int = -12000
    println("Integer Type Value = $c")
    /*
        Long:
            Size 8 Bytes
            Range -9223372036854775807 to 922337203685775806
    */
    val d:Long = 999_999_999_999
    println("Long Type Value = $d")
    /*
        Float: Decimal Number Type
            Size 4 Bytes
            Range -3.4028235E+38 to 3.4028235E+38
            Decimal Digits 6
     */
    val e:Float = 1.546546f
    println("Float Type Value = $e")
    /*
        Double: Decimal Number Type
            Size 8 Bytes
            Range -1.797693E+308 to 1.797693E+308
            Decimal Digits Upto 16
     */
    val f:Double = 1.56625889532
    println("Double Type Value = $f")
    /*
        Character:
            Char:
                Size 2 Bytes
                Kotlin Uses UniCode System
                Ranges \u0000 to \uffff
                Denoted By Single Quote And Only With 1 Character
     */
    val g:Char = 'A'
    println("Character Type Value = $g")
    /*
        String:
            Denoted By Double Quotes
            It Is Like A Simple Text
    */
    val h:String = "Hello, Kotlin!"
    println("String Type Value = $h")
    /*
        Any:-
            Is Used To Initialize Any Type Of Value To The Variable
     */
    var i:Any = 5 // Int Value
        i=6.8754  // Double Value
    println("Any Type Value = $i")

}

/*
    Visit:- https://kotlinlang.org/docs/basic-types.html
 */