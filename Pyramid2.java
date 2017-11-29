import java.util.Scanner;
public class Pyramid2{
 public static void main(String[] args) {
  Scanner scn=new Scanner(System.in);
  System.out.print("Enter the number of star = ");
  int n=scn.nextInt();
  for (int i = 1; i <=n; i=i+1) {
   for (int j = 1; j <=1; j=j+1) {
    System.out.print(" ");
   }
   for (int k = 1; k <=i; k++) {
    System.out.print("*"); 
   }
   System.out.println(""); 
  }
 }
}