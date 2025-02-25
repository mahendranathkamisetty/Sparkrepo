object primeorodd27 {
  def main(args:Array[String]): Unit = {
    val num=11
    var count=0
    for(i<-1 to num){
      if(num%i==0){
        count=count+1
      }
    }
    if(count==2 || num%2!=0){
      print("given number is odd or prime")
    }
    else if(count==2){
      print("given number is even prime")
    }
    else{
      print("not a prime number")
    }
  }
}
