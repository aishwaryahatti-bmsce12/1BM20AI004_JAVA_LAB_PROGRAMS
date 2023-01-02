# WAJP to design a simple calculator using switch statement ,handle arithmetic exception wherever necessary
import java.util.*;
class demo3{
public static void main(String args[]){
int a,b,c;

Scanner obj=new Scanner(System.in);
System.out.println("enter a value: ");
a=obj.nextInt();
System.out.println("enter b value: ");
b=obj.nextInt();
try{
int operation='-';
switch(operation){
case '+':
    c=a+b;
    System.out.println(c);
    break;
  case '-':
    c=a-b;
    System.out.println(c);
    break;
  case '*':
  c=a*b;
    System.out.println(c);
    break;
  case '/':
  c=a/b;
    System.out.println(c);
    break;
     }
     }
catch(ArithmeticException e){
System.out.println("exception occurs");

System.out.println(" b value =0");

}

System.out.println(" program completed");

}
}
