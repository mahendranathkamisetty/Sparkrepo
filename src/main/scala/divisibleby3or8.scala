object divisibleby3or8 {
  def main(args:Array[String]): Unit = {
    val num=24
    if(num%8==0 || num%3==0){
      println("Number  is divisible by 8 or divisible by 3")
    }
    else{
      println("not divisible by 3 and 8")
    }
  }

}
