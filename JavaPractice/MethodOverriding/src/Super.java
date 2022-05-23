public class Super {
    public void display(){
        System.out.println("Hello");
    }
}

 class Sub extends Super{
    public void display(){
        System.out.println("Hello World");
    }
}

class MethodOverriding{
    public static void main(String[] args){
        Super su = new Super();
        su.display();
        Sub sp = new Sub();
        sp.display();
        Super sup = new Sub();
        sup.display();
    }
}