//Q2) Write a Java Program to calculate the area and perimeter of a circle whose radius is taken from the user

import java.util.Scanner;
public class P1B
{
   public static void main(String args[])
  {
   Scanner s = new Scanner(System.in);
   System.out.print("Enter the radius");
   double r = s.nextDouble();
   double perimeter = 2*3.14*r;
   double area = 3.14*r*r;
   System.out.println("The perimeter is"+perimeter);
   System.out.println("The area is"+area);
  }
}