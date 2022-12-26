import java.util.Random;
import SQUARE.*;
import CUBE.*;

abstract class rand{
 int number;
 abstract int random_num();
}
class rand2 extends rand{
 int random_num()
 {
  Random randomNum = new Random();
  number = randomNum.nextInt(100); 
  return number;
 }
}

public class square_cube{
 public static void main(String args[])
 {
  rand2 r=new rand2();
  int x=r.random_num();
  square s=new square(x);
  cube c=new cube(x);
  System.out.println("Random number generated ="+x);
  System.out.println("Square="+s.cal_square());
  System.out.println("Cube ="+c.cal_cube());
  }
 }