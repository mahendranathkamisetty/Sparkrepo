object divisibleby3and5 {
  def main(args:Array[String]): Unit = {
    val num=14
    if(num%3==0 && num%5==0){
      println("number is divisible by both 3 and 5")
    }
    else{
      println("number is not divisble by 3 and 5")
    }
  }

}
