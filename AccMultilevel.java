class Account{
    String cust_name;
    int account_no;
    Account(String n,int acc){
        cust_name=n;
        account_no=acc;
    }
}
class Savings extends Account{
    int min_bal,sav_bal;
    Savings(String n,int acc,int mb,int sb){
        super(n,acc);
        min_bal=mb;
        sav_bal=sb;
    }
}
class AccountDetails extends Savings{
    int deposit,widthrawl;
    AccountDetails(String n,int acc,int mb,int sb,int w,int d){
        super(n,acc,mb,sb);
        deposit=d;
        widthrawl=w;
    }
    void print(){
        System.out.println("customer name:"+cust_name);
        System.out.println("customer account no:"+account_no);
         System.out.println("minimum balance:"+min_bal);
          System.out.println("savings:"+sav_bal);
           System.out.println("deposits:"+deposit);
            System.out.println("widthrawl"+widthrawl);
    }
}
public class MultiLevel{
    public static void main(String[]arg){
        AccountDetails ad=new AccountDetails("ABC",120001,23432,23222,233,1);
        ad.print();
    }
}