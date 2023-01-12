fun TriangleInequality(a: Int, b: Int, c: Int)
{
    if(a > 0 && b > 0 && c > 0)
        if((a < b + c) && (b < a + c) && (c < a + b))
            println("Độ dài có thể tạo được hình tam giác")
        else
            println("Độ dài không tạo được hình tam giác")
    else
    	println("Độ dài không hợp lệ")
}

fun main() {
    TriangleInequality(1,2,2)
    TriangleInequality(1,2,3)
    TriangleInequality(1,2,-2)
}