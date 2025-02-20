object nonpositiveeven {
  def main(args:Array[String]): Unit = {
    val num = -6
    if(num<=0 && num%2==0){
      println("given number is non-positive and even")
    }
    else{
      println("number is positive and even or negative and odd")
    }
  }

}
