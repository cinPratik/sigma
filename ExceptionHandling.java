import java.util.*;
 public class NumberException{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num1,num2,q;
        try{
        System.out.println("enter first number:");
        num1=s.nextInt();
         System.out.println("enter secomd number:");
        num2=s.nextInt();
        q=num1/num2;
         System.out.println("qoitent is:"+q);
       }catch(ArithmeticException e){
            System.out.println("cannot devide by zero..reenter!!");
       }catch(InputMismatchException e){
           System.out.println("dont enter char");
       }
    }
}
