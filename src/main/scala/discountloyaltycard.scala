object discountloyaltycard {
  def main(args:Array[String]): Unit = {
    val purchaseAmount=180
    var loyaltycard=true
    if(purchaseAmount>200 || loyaltycard){
      println("customer is eligible for discount and qualifies for membership benefits")
    }
    else{
      println("no membership no discount")
    }
  }

}
