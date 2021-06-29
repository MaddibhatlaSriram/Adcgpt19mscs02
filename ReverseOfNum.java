import java.util.*;
class ReverseOfNum {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        long sum=0;
        long n=sc.nextLong();
        while(n>0||n<0)
        {
            long s=n%10;
            sum=(sum*10)+s;
            n=n/10;
        }
        if(sum>Integer.MAX_VALUE){
            sum=0;
        }
        System.out.println(sum);
        
    }
}