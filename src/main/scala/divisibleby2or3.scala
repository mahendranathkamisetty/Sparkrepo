object divisibleby2or3 {
  def main(args:Array[String]): Unit = {
    val num=9
    if(num%2==0 || num%3==0){
      println("number is divisible by either 2 or 3")
    }
    else{
      println("number is not divisible by 2 or 3")
    }
  }

}
