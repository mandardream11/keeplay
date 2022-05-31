package ThreadsPractice;


class MyRun implements Runnable{
    @Override
    public void run() {

    }
}

class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }
}

public class ThreadTest {
    public static void main(String [] args)
    {
        //Calling all the constructors of Thread class
        Thread th = new Thread(new MyRun(),"MyThreadName");
        Thread th1 = new Thread("My Thread name 2");
        Thread th2 = new Thread(new MyRun());
        MyThread t = new MyThread("Thread 1");
    }
}
