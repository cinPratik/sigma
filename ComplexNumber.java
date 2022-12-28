public class ComplexNumber{
    int real,image;
    public ComplexNumber(int r,int i){
        this.real=r;
        this.image=i;
    }
    void display(){
        System.out.println(this.real+"+i"+this.image);
    }
    static ComplexNumber add(ComplexNumber n1,ComplexNumber n2){
        ComplexNumber res= new ComplexNumber(0,0);
        res.real=n1.real+n2.real;
        res.image=n1.image+n2.image;
        return res;
    }
    public static void main(String[]args){
        ComplexNumber c1 =new ComplexNumber(4,5);
        ComplexNumber c2= new ComplexNumber(11,23);
        System.out.println("first complexno. is:");
           c1.display();
        System.out.println("second complexno. is:");
        c2.display();
        ComplexNumber res=add(c1,c2);
        System.out.println("addition of these two is:");
        res.display();
        
    }
}