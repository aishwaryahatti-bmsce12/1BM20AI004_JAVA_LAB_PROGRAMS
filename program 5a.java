enum size{
small,medium,large,monster
}

public class test{
size psize;
test(size pizzasize){
this.psize=pizzasize;
}
public void orderPizza(){

switch(psize){
case small:System.out.println("I ordered small pizza");
break;
case medium:System.out.println("I ordered medium pizza");
break;
case large:System.out.println("I ordered large pizza");
break;
case monster:System.out.println("I ordered monster pizza");
break;
default:System.out.println("I ordered  pizza");

}
}
}
class driver{
public static void main(String args[]){
size s=size.small;
test t=new test(s);
t.orderPizza();
}
}
