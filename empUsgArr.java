import java.util.Scanner;
 public class Employee{
    int empid;
    String name;
    float salary;
    
  void getInput(){
      Scanner s = new Scanner(System.in);
      System.out.println("enter the empid:");
      empid=s.nextInt();
      System.out.println("enter emp name:");
      name=s.next();
      System.out.println("enter thee salary:");
      salary=s.nextFloat();
  }
  void display(){
      System.out.println("enployee id is:"+empid);
      System.out.println("enployee name is:"+name);
      System.out.println("enployee salary is:"+salary);
  }
  public static void main(String[]args){
      Employee e[]=new Employee[5];
      for(int i=0;i<5;i++){
          e[i]=new Employee();
          e[i].getInput();
      }
      for(int i=0;i<5;i++){
          e[i].display();
      }
  }
}