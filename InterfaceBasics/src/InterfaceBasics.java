interface Test{
    void meth1();
    void meth2();
}

class My implements  Test{
    @Override
    public void meth1(){
        System.out.println("My Class meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("My Class meth 2");
    }
}

public class InterfaceBasics {
    public static void main(String [] args){
        Test t =new My();
        t.meth1();
        t.meth2();
    }
}
