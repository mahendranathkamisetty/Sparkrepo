object seniorcitizencustomer {
  def main(args:Array[String]): Unit = {
    val age=70
    val newCustomer=false
    if(age>65 && !newCustomer){
      println("eligible for senior citizen discount and not a new customer")
    }
    else{
      println("eligible for senior citizen discount and may be new customer")
    }

  }

}
