package testPackage;

class Test extends Thread{

    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

class ThreadTest{
    public static void main(String[] args){
        Test t= new Test();
        t.start();
        int i=1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
}

