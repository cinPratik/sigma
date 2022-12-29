public class NestedTry{
    public static void main(String []args){
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
            try{
                int x=arr[2]/4;
            }catch(ArithmeticException e){
                System.out.println("nit divisible by zero!!");//perfrom devision by 0
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("elemet at such index does noot exists");
            
        }
    }
}