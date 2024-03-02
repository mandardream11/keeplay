public class staticpractice {
    public static void main(String[] args){
        Test t1 = new Test();
        t1.show();
        t1.x=30;
        t1.y=50;

        Test t2 = new Test();
        t1.show();
    }
}

class Test{
    static int x =10;
    int y =20;

   void show(){
       System.out.println(x +" "+ y);
   }

   static void display(){
       System.out.println(x);
   }
}


// Static member is common to all the methods unlike non static members.