/*Andi Firda Januarti
13020210069*/

interface A{ public void aaa(); }
interface B extends A{
public void aaa();
}
class Central0069 implements A,B{
public void aaa(){
System.out.println("aaa");
}
public static void main(String arg[]){
System.out.println("main");
this.aaa();
}
 }
