 // Dynamic Method Dispatch - Definition
 // When reference is of super class and object is of sub class, when we call overridden method using reference of super class,
 // this is called Dynamic method dispatch or run time polymorphism.


  class Super{
    public void meth1(){
        System.out.println("Super Method 1");
    }
      public void meth2(){
          System.out.println("Super Method 2");
      }
}

class Sub extends Super{
    public void meth3(){
        System.out.println("Sub Method 3");
    }
    @Override
    public void meth2(){
        System.out.println("Sub Method 2");
    }

}

public class DynamicMethodDispatch {

    public static void main(String[] argd){
        Super su = new Sub();
        su.meth1();
        su.meth2();

    }
}
