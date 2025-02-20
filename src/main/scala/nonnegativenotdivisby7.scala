object nonnegativenotdivisby7 {
  def main(args:Array[String]): Unit = {
    val num=14
    if(num>=0 && num%7!=0){
      println("number is non negative and not divisible by 7")
    }
    else{
      println("number is negative and dvisible by 7 or negative non divisible by 7 or positive divisible by 7")
    }
  }

}
