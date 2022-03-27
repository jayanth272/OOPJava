import java.util.*;
abstract class Shape
{
Scanner sc=new Scanner(System.in);
int a;
int b;
abstract void printArea();
}

class Rectangle extends Shape
{
void printArea()
{
System.out.println("\n length of rectangle:");
a=sc.nextInt();
System.out.println("\n breadth of rectangle:");
b=sc.nextInt();
int area=a*b;
System.out.print("\n Area of rectangle :");
System.out.print(area);
}
}

class Triangle extends Shape
{
void printArea()
{
System.out.println("\nbase of triangle:");
a=sc.nextInt();
System.out.println("\nheight of triangle:");
b=sc.nextInt();
int area=(int)(a*b*(0.5));
System.out.print("\n Area of triangle :");
System.out.print(area);
}
}
class Circle extends Shape
{
void printArea()
{
System.out.println("\n\n radius of circle:");
a=sc.nextInt();
float pi=(float)3.14;
float area=a*a*pi;
System.out.print("\n Area of circle : ");
System.out.print(area);
}
}
class Main
{
public static void main(String args[])
{
Rectangle s1=new Rectangle();
Triangle s2= new Triangle();
Circle s3=new Circle();
s1.printArea();
s2.printArea();
s3.printArea();

}
}