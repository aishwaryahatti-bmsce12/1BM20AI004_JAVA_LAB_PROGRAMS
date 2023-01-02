#WAJP to input n values and store them in an array ,if the user wants to print an element of  array of given index,and index>array length ,generate exception and print valid mssg
import java.util.*;
class demo4{
public static void main(String args[]){
int n,i,index;

Scanner obj=new Scanner(System.in);
System.out.println("enter array size: ");
n=obj.nextInt();
int a[]=new int[n];
System.out.println("enter array elements: ");

for(i=0;i<n;i++){
a[i]=obj.nextInt();
}
System.out.println("enter index value: ");
index=obj.nextInt();
try{

System.out.println("element at index "+index+"= "+a[index]);
}
catch(Exception e){
System.out.println("array out of bound");

}
}
}
