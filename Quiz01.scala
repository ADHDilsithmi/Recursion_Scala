/* Quiz 01
  Can you write a recursive function prime(n) that returns true for a prime number and false for the other?
  For example prime(5) should return true and prime(8) should return false.
 */

object Quiz01 extends App {

  def GCD(a:Int, b:Int) : Int=b match{
    case 0 => a
    case b if b>a => GCD(b,a)
    case _ => GCD(b,a%b)
  }

  def prime(p:Int, n:Int=2):Boolean = n match{
    case x if(x==p)=> true
    case x if GCD(p,x)>1 => false
    case x => prime(p, x+1)
  }
  println(prime(5))
  println(prime(8))

}
