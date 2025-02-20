object discount {
  def main(args:Array[String]): Unit = {
    val age=63
    if(age>60){
      println("Eligible for senior citizen discount")
    }
    else if(age<25){
      println("eligible for student discount")
    }
    else{
      println("No discount available")
    }
  }

}
