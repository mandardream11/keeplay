import java.util.Scanner;

public class Area {

    public static void main(String[] args)
    {

     //Area of right angle triangle
        float base , height, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base and height of triangle ");
        base = scanner.nextFloat();
        height = scanner.nextFloat();
        area = (base*height)/2;
        System.out.println("Area of triangle is : " + area );

    //Area of any triangle with 3 sides
        int a,b,c;
        float s;
        double Area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of sides of triangle ");
        a= sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s = (a+b+c)/2f;
        Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of a triangle is " + Area);
    }

}
