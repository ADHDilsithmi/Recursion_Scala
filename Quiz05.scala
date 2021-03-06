/* Quiz 05
  Can you write a recursive function to get the addition of all even numbers less than given n.
*/

object Quiz05 extends App {

  def isEven(n:Int):Boolean= n match{
    case 0=>true
    case _=> isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def evenSum(n:Int,a:Int=0): Int= {
    if (n==0)
      return 0;
    else
      if(isEven(n))
      {
        return n+(evenSum(n-1))
      }else
      {
        return evenSum(n-1)
      }
  }
  println(evenSum(5))

}
