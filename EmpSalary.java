class Employee{
    String name,add,mail;
    float id,mobile,basicPay;
    void salary(){
        float da,hra,pf,cf,gross;
        da=basicPay*97/100;
        hra=basicPay*10/100;
        pf=basicPay*10/100;
        cf=basicPay*0.1f/100;
        gross=basicPay+da+hra-pf-cf;
        System.out.println("name:"+name);
         System.out.println("basic salary:"+basicPay);
          System.out.println("gorss salary:"+gross);
           System.out.println("mailid:"+mail);
            System.out.println("\n");
        
    }
}
class Programmer extends Employee{
    Programmer(String name,int sal,String mail){
         System.out.println("programmer salary details:");
         this.name=name;
         this.mail=mail;
         basicPay=sal;
    }
}
class TeamLead extends Employee{
    TeamLead(String name,int sal,String mail){
         System.out.println("team leader salary details:");
         this.name=name;
         this.mail=mail;
         basicPay=sal;
    }
}
class APM extends Employee{
APM(String name,int sal,String mail){
    System.out.println("APM salary details:");
     this.name=name;
         this.mail=mail;
         basicPay=sal;
     }
}
class ProjectManager extends Employee{
    ProjectManager(String name,int sal,String mail){
      System.out.println("ProjectManager salary details:");
     this.name=name;
         this.mail=mail;
         basicPay=sal;  
    }
}
public class Inheritance{
    public static void main(String[]args){
        Programmer p= new Programmer("prath",500000,"prath@xyzgmail.com");
        p.salary();
        TeamLead t= new TeamLead("kb",35665,"kb@1123gmail.com");
        t.salary();
        APM a=new APM("karan",4354,"karan@gmail.com");
        a.salary();
        ProjectManager pm=new ProjectManager("pratik",1000000,"pratik@gmail.com");
        pm.salary();
    }
}