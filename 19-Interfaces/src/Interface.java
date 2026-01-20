interface OddEven {
    void oddEven();
}
interface Natural{
    void sum();
}
public class Interface implements OddEven,Natural{
    public static void main(String[] args) {
        Interface obj=new Interface();
        obj.sum();
        obj.oddEven();
    }
    @Override
    public void sum() {
        int sum =0;
        for(int i=0;i<10;i++){
            sum=+i;
        }
        System.out.println("Sum="+sum);
       
    }

    @Override
    public void oddEven() {
        int a=10;
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }
    

}
