package MyPack2;

import MyPack1.Demo1;

//Different pacakge sub class - Private and Default access modifiers are not allowed.
public class Demo4 extends Demo1{
     public void show(){
         System.out.println(a+b+c+d);
     }
}
