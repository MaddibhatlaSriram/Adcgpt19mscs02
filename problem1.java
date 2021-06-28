import java.util.*;
class TestClass {
    public static void main(String args[] ){
       Scanner sc=new Scanner(System.in);
       double D=sc.nextDouble();
       double Oc=sc.nextDouble();
       double Of=sc.nextDouble();
       double Od=sc.nextDouble();
       double Cs=sc.nextDouble();
       double Cb=sc.nextDouble();
       double Cm=sc.nextDouble();
       double Cd=sc.nextDouble();
       double Tonline=Oc+((D-Of)*Od);
       double Tclassic=Cb+((D/Cs)*Cm)+(D*Cd);
       if(Tonline<Tclassic)
       System.out.println("Online Taxi");
       else
       System.out.println("Classic Taxi");
    }
}
