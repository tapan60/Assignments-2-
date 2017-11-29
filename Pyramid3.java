import java.util.Scanner;
public class Pyramid3{
 public static void main(String[] args) {
  Scanner scn=new Scanner(System.in);
  System.out.print("Enter the number of star = ");
  int n=scn.nextInt();
  for (int i = n; i >=1; i--) {
   for (int j = 1; j <i; j++) {
    System.out.print(" ");
   }
   for (int k = n; k >=i; k--) {
    System.out.print("*"); 
   }
   System.out.println(""); 
  }
 }
}