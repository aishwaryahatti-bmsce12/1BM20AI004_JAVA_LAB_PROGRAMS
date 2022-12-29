//Write an interactive program that reads a statement from user input and:
//i. prints how many words it has.
//ii. Converts it to uppercase and print the output.
class e{
public static void main(String args[]){
String str;
Scanner obj= new Scanner(System.in);
System.out.println("write your statement:");
str=obj.nextLine();
System.out.println(str.toUpperCase());
int count = 1;
for (int i = 0; i < str.length() - 1; i++)
{
 if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
      {
        count++;
       }
}
        System.out.println("Number of words in a string : " + count);
}
}
