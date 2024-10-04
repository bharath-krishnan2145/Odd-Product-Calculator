import java.util.*;
public class Odd_product_calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mul=1;
        for(int i=m;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                mul=mul*i;
                
            }
        }
        System.out.println();
        if(m>n){
            System.out.println("1");
        }
        else{
            System.out.println(mul);
        }

    }
}