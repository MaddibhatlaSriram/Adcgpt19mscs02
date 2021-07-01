import java.util.*;
class Pyramid3
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch='A';
int N=sc.nextInt();
for(int i=1;i<=N;i++)
{
System.out.println();
for(int j=1;j<=i;j++)
{
System.out.print(ch+" ");
ch++;
}
}
}
}