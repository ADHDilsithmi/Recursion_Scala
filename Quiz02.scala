/* Quiz 02
  Can you write a recursive function primeSeq(n) that prints all prime number which less than n?
 */

object Quiz02 extends App {

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

  def primeSeq(p:Int, n:Int=2):Unit= p match{
    case x if (n == x)=>{
      return;
    }
    case _=>
    {
      if(prime(n))
      {
        println(n)
      }
      primeSeq(p,n+1)
    }
  }
  primeSeq(10)

}
