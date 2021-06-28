import java.util.*;
class EvenDigits
{
public static void main(String args[])
{
int even=0,odd=0;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE VALUE OF N :");
int n=sc.nextInt();
while(n>0)
{
int m=n%10;
if(m%2==0){
even=even+1;
}
else if(m==1||m%2==1){
odd=odd+1;
}
n=n/10;
}
System.out.println("odd digits= "+odd);
System.out.println("even digits= "+even);
}
}