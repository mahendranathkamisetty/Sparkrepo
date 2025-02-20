object numberrange {
  def main(args:Array[String]): Unit = {
    val num=25
    if((num>=1 && num<=10) || (num>=20 && num<=30)){
      println("Given Number is present between 1 to 10 or 20 to 30")
    }
    else{
      print("Given number is not present in the given range")
    }
  }

}
