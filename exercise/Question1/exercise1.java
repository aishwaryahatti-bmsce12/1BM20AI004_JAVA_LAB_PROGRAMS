class number{
   private double n;

   number(double d){
      n=d;
   }

   public boolean isZero(){
      if(n==0.0)
         return true;
      else
         return false;
   }
   
    public boolean isPositive(){
      if(n>0.0)
         return true;
      else
         return false;
   }
   
   public boolean isNegative(){
      if(n<0.0)
         return true;
      else
         return false;
   }
   
   public boolean isOdd(){
      if(n%2 != 0.0)
         return true;
      else
         return false;
   }
   
   public boolean isEven(){
      if(n%2 == 0.0)
         return true;
      else
         return false;
   }
   
   public boolean isPrime(){
      if(n==0.0)
         return true;
      else
         return false;
   }
   
   public double getFactorial(){
   double fact=1;
   int i;
   for(i=1;i<=n;i++){
   fact=fact*i;
   }
   return fact;
   }
   
   public double getSqrt(){
   return Math.sqrt(n);
   }
   
   public double getSqr(){
   return Math.pow(n,2);
   }
   
   public double sumDigits(){
   double r,sum=0;
   for(int i=1;i<n;i++){
   r=n%10;
   sum=sum+r;
   n=n/10;
   }
   return sum;
   }
   
   public double getReverse(){
   double r,s=0;
   for(int i=1;i<n;i++){
   r=n%10;
   s=(s*10)+r;
   n=n/10;
   }
   return s; 
   }

}

class exercise1{
public static void main(String args[]){
number n1 = new number(123.00);
System.out.println("isZero= "+ n1.isZero() );
System.out.println("isPositive= "+ n1.isPositive() );
System.out.println("isNegative= "+ n1.isNegative() );
System.out.println("isOdd= "+ n1.isOdd() );
System.out.println("isEven= "+ n1.isEven() );
System.out.println("Factorial= "+ n1.getFactorial() );
System.out.println("Square root= "+ n1.getSqrt() );
System.out.println("Square= "+ n1.getSqr() );
System.out.println("Sum of digits= "+ n1.sumDigits() );
System.out.println("Reverse= "+ n1.getReverse() );


}
}