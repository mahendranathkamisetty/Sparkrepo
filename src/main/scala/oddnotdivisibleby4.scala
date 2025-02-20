object oddnotdivisibleby4 {
  def main(args:Array[String]): Unit = {
    val num=15
    if(num%2!=0 && num%4!=0){
      println("number is odd and not divisible by 4")
    }
    else{
      println("number is even or divisible by 4")
    }
  }

}
