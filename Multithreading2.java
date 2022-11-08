class tab implements Runnable{
    public void run(){
        for (int i = 1; i <= 25; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
             catch (Exception e) {}
        }
    }
}
class cha implements Runnable{
    public void run(){
        for (char i = 65; i <= 90; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            }
             catch (Exception e) {}
        }
    }
}
public class Multithreading2 {
    public static void main(String[] args) {
        tab h1 = new tab();
        cha h2 = new cha();
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);
        t1.start();
        t2.start();
    }
}
