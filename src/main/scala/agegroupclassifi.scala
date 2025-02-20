object agegroupclassifi {
  def main(args:Array[String]): Unit = {
    val age=15
    if(age<13){
      println("you are a child")
    }
    else if(age>=13 && age<=19){
      println("you are a teenager")
    }
    else{
      println("you are an adult")
    }
  }

}
