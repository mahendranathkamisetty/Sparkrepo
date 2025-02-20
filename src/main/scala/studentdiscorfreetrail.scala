object studentdiscorfreetrail {
  def main(args:Array[String]): Unit = {
    val age=225
    val freeTrail=true
    if(age<25 || freeTrail){
      println("eligible for student discount or eligible for free trail")
    }
    else{
      println("not eligible for student discount and not a free trail")
    }
  }

}
