//package labrecord;
import java.util.Scanner;
public class CompoundInterest {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.print("Enter The Value Of principal:");
double p =sc.nextDouble();
System.out.print("Enter The Value Of rate: ");
double r =sc.nextDouble();
System.out.print("Enter The Value Of time:");
double t =sc.nextDouble();
double a = p*(Math.pow(1+r/100, t));
double cp=a-p;
System.out.println("Compound Interest Is :"+ cp);
sc.close();
}
}