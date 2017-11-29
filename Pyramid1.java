import java.util.Scanner;
public class Pyramid1{
 public static void main(String[] args) {
  Scanner scn=new Scanner(System.in);
  System.out.print("Enter the number of star = ");
  int n=scn.nextInt();
  for (int i = 1; i <=n; i=i+1) {
   for (int j = i; j <n; j=j+1) {
    System.out.print(" ");
   }
   for (int k = 1; k <(i*2); k=k+1) {
    System.out.print("*"); 
   }
   System.out.println(""); 
  }
 }
}