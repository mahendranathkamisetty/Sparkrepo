object voteordrive {
  def main(args:Array[String]): Unit = {
    val age=20
    if(age>=18){
      print("eligible to vote")
    }
    else if(age>=16){
      println("eligible to drive")
    }
    else{
      println("Not eligible to vote or drive")
    }
  }

}
