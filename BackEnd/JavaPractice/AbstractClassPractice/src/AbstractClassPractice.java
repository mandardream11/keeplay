abstract class Super{
    public Super(){
        System.out.println("Super constructor");
    }
    public void meth1(){
        System.out.println("Super method");
    }
    abstract void meth2();
}

class Sub extends Super{
    public Sub(){
        System.out.println("Sub Constructor");
    }
    public void meth1(){
        System.out.println("Sub method 1");
    }
    @Override
    public void meth2(){
        System.out.println("Sub method 2");
    }

}

public class AbstractClassPractice {
    public static void main(String[] args){
    Super su=new Sub();
    su.meth2();
    }
}
