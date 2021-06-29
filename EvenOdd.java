import java.util.*;
class EvenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=n;
while(n>0)
{
int ra=n%10;
if(ra%2==0){
System.out.print(ra);
}
n=n/10;
}
System.out.print(" ");
while(m>0)
{
int rb=m%10;
if(rb%2==1){
System.out.print(rb);
}
m=m/10;
}
}
}