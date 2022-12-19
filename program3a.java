interface Tossable
{
 public void toss();
}

abstract class Ball implements Tossable
{
 String brandName;
 Ball(String brandName)
 {
  this.brandName=brandName;
 }
 String getBrandName()
 {
  return brandName;
 }
 void bounce()
 {
  System.out.println(brandName+"bounces well");
 }
}

class Rock implements Tossable
{
 public void toss()
 {
  System.out.println("Rock is Tossed in the air");
 }
}

class Baseball extends Ball
{
 Baseball(String brandName)
 {
  super(brandName);
 }
 public void toss()
 {
  System.out.println(brandName+" baseball is tossed in air");
 }
 void bounce()
 {
  System.out.println(brandName+" baseball is bouncing in the air");
 }
}

class Football extends Ball
{
 Football(String brandName)
 {
  super(brandName);
 }
 public void toss()
 {
  System.out.println(brandName+" football is tossed in air");
 }
 void bounce()
 {
  System.out.println(brandName+" football is bouncing.");
 }
}

class program3a
{
 public static void main(String args[])
 {
  Baseball b=new Baseball("Adidas");
  b.getBrandName();
  b.toss();
  b.bounce();
  Football f=new Football("Nike");
  f.getBrandName();
  f.toss();
  f.bounce();
  Rock r= new Rock();
  r.toss();
  }
 }
