object divisibleby4or6 {
  def main(args:Array[String]): Unit = {
    val num=18
    if(num%4==0 || num%6==0){
      println("number is divisible by either 4 or 6")
    }
    else{
      println("number is not divisible by 4 or 6")
    }
  }

}
