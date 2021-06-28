import java.util.*;
class CheckVowels
{
public static void main(String args[])
{
System.out.print("ENTER THE CHARACTER :");
Scanner sc=new Scanner(System.in);
char a5=sc.next().charAt(0);
switch(a5)
{
case 'a':
System.out.println(a5+" is vowel");break;
case 'e':
System.out.println(a5+" is vowel");break;
case 'i':
System.out.println(a5+" is vowel");break;
case 'o':
System.out.println(a5+" is vowel");break;
case 'u':
System.out.println(a5+" is vowel");break;
case 'A':
System.out.println(a5+" is vowel");break;
case 'E':
System.out.println(a5+" is vowel");break;
case 'I':
System.out.println(a5+" is vowel");break;
case 'O':
System.out.println(a5+" is vowel");break;
case 'U':
System.out.println(a5+" is vowel");break;
default:System.out.println(a5+" is Consonant");
}
}
}