abstract class Shape {

    abstract double area();
    abstract double perimeter();

}

class Circle extends Shape{
    double area(){
        double area;
        int radius=15;
        area=3.14*radius*radius;
        return area;
    }

    double perimeter(){
        double C;
        int radius=15;
        C= 2*3.14*radius;
    return C;
    }
}

class AbstractClassForShape{
    public static void main(String[] args){
        Shape sh=new Circle();
        System.out.println(sh.area());
        System.out.println(sh.perimeter());
    }
}