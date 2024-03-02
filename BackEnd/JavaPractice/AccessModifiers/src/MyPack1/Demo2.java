package MyPack1;

// Same package - Non sub class - private is not accessible
public class Demo2 {
    Demo1 d=new Demo1();
    public void show(){
        System.out.println(d.a+d.b+d.c+d.d);
    }
}
