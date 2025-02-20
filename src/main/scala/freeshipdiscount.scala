object freeshipdiscount {
  def main(args:Array[String]): Unit = {
    val purchaseAmount=120
    if(purchaseAmount>150){
      println("Customer is eligible for a discount")
    }
    else if(purchaseAmount>100){
      println("qualifies for free shipping")
    }
    else{
      println("no discount or no free shipping")
    }
  }

}
