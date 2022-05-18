public class rectangle {
    int length;
    int breadth;

    rectangle(){
        length=breadth=1;
    }
    rectangle(int l, int b){
        length=l;
        breadth=b;
    }
}

 class Cuboid extends rectangle{
    int height;
    Cuboid(){
        height = 1;
    }
     Cuboid(int h, int l, int b){
        super(l,b);
        height =h;
     }

     int volume(){
        return length*breadth*height;
     }
}

class Inheritance{
    public static void main(String [] args){
        Cuboid c=new Cuboid(10,5,3);
        System.out.println(c.volume());
    }
}


