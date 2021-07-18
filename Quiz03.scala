/* Quiz 03
  Can you write a recursive function returns the addition of numbers from1 to n?
 */

object Quiz03 extends App {

  def sum(x:Int) : Int={
    x match{
      case 1 => x
      case _ => x+sum(x-1)
    }
  }
  println(sum(7))

}
