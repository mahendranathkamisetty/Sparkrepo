object divisibleby2or5 {
  def main(args:Array[String]): Unit = {
    val num=25
    if(num%2==0 || num%5==0){
      println("given number is divisible by either 5 or 2")
    }
    else{
      println("number is not divisible by 2 and 5")
    }
  }

}
