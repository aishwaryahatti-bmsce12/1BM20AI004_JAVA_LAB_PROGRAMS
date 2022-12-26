package GCD;

public class gcd{
 int n1,n2,temp;
 public gcd(int a,int b)
 {
  this.n1=a;
  this.n2=b;
 }
 public int cal_gcd()
 {
  while(n2 != 0)
  {
   temp = n2;  
   n2=n1%n2;  
   n1=temp;
  }
  return n1;
 }
}