class Outer{
    int x=10;

    void outerDisplay(){
        Inner inn = new Inner();
        inn.innerDisplay();
        System.out.println("Outer Display method");
    }

    class Inner{
        void innerDisplay(){
            System.out.println("Inner Display method");
        }
    }
}
public class Test {
    public static void main(String [] args){
    Outer out = new Outer();
    out.outerDisplay();
    }
}
