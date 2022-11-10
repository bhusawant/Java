class Thread1 extends Thread{
    public void run(){
        System.out.print("a");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.print("b");
    }
}
class Thread3 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.print(i+" ");
        }
    }
}
public class Multithreading1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();        
    }
}
