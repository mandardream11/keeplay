public class MethodPractice {

    static class Test
    {
      static int Max(int x, int y)
    {
        if (x>y)
            return x;
        else
            return y;
    }
    }

    public static void main(String[] args){
    int a=211,b=2222,c;
    //Calling method
        c= Test.Max(a,b);
        System.out.println(c);

    }


}
