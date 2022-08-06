//21CE141 : PRIYANSHI TALAVIYA PRAC1 : MAIN
import java.util.*;

public class ex1_1 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
pr1 c = new pr1();
System.out.println("Enter radius of the circle :");
c.radius=sc.nextDouble();
System.out.println("Area of the circle is : "+c.getArea());
System.out.println("Perimeter of the circle : "+c.getPerimeter());
}
}
