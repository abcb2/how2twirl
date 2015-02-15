package how2twirl

object MainApp {
  def main(args:Array[String]){
    sample001()
    sample002()
    sample003()
    sample004()
  }
  def sample004(){
    val customer = new Customer("customer_taro")
    val orders = List(new Order("order 1"), new Order("order 2"))
    val content = html.sample004(customer, orders)
    println(content)
  }
  def sample003(){
    val content = pkghoge.txt.bye("YES", 30)
    println(content)
  }
  def sample002(){
    println(pkghoge.txt.hello("Jiro", 19))
  }
  def sample001(){
    println(html.hello("Taro", 20))
  }
}