package LCM;

public class lcm{
 int n1,n2,lcm;
 public lcm(int a,int b)
 {
  this.n1=a;
  this.n2=b;
 }
 public int cal_lcm()
 {
   lcm = (n1 > n2) ? n1 : n2;
    while(true) {
      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
        break;
      }
      ++lcm;
      }
     return lcm;
  }
 }