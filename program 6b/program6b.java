// Write a program to find the number of vowels, consonents, digits and white space characters in a string.
class d{
public static void main(String args[]){
int i;
String str="my name is aish";
System.out.println(str.length());
int vowelcount=0;
int consonantcount=0;
int digtscount=0;
int whitespacecount=0;

for(i=0;i<str.length();i++){
if(str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
vowelcount++;

}
else{
consonantcount++;
}
if(str.charAt(i) == ' '){
whitespacecount++;

}
}

System.out.println("vowelcount is: "+vowelcount);
System.out.println("consonantcount is: "+consonantcount);
System.out.println("whitespacecount is: "+whitespacecount);


}
}
