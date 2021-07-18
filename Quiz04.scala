/* Quiz 04
  Can you write a recursive function to determine even and odd numbers?
 */

object Quiz04 extends App {

  def isEven(n:Int) :Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int) :Boolean = !(isEven(n))

  def display(a:Int) :Unit = {
    if(isEven(a))
      println(a + " is Even Number")
    else
      println(a + " is Odd Number")
  }
  display(6)
  display(7)

}
