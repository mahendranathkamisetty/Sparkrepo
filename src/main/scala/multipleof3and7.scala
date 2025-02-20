object multipleof3and7 {
  def main(args:Array[String]): Unit = {
    val num=21
    if(num%3==0 && num%7==0){
      println("number is multiple of both 3 and 7")
    }
    else{
      println("not a multiple of 3 and 7 ")
    }
  }

}
