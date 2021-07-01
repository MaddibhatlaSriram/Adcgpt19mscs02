import java.util.*;
class Pyramid2
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
for(int i=1;i<=N;i++)
{
System.out.println();
for(int j=1;j<=i;j++)
{
System.out.print("* ");
}
}
for(int p=N-1;p>=1;p--)
{
System.out.println();
for(int q=1;q<=p;q++)
{
System.out.print("* ");
}
}
}
}