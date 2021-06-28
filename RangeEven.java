import java.util.*;
class RangeEven
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER VALUES OF n & m :");
int n=sc.nextInt();
int m=sc.nextInt();
int i=m;
while(i>=n)
{
if(i%2==0)
{
System.out.print(i+"  ");
}
i--;
}
}
}