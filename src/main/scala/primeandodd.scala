object primeandodd {
  def main(args:Array[String]): Unit = {
    val num=17
    var count=0
    for(i<-1 to num){
        if(num%i==0){
          count=count+1
        }
    }
    if(count==2 && num%2!=0){
      print("Prime number and odd")
    }
    else if(count==2){
      print("even prime number")
    }
    else{
      print("not a either prime or odd number")
    }

  }

}
