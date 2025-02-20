object divisibleby5or9 {
  def main(args:Array[String]): Unit = {
    val num=45
    if(num%5 ==0 || num%9==0){
      println("number is divisible by either 5 or 9")
    }
    else{
      println("number is not divisible by 5 or 9")
    }
  }

}
