class greet1{
    greet1(){
        System.out.println("Good morning");
    }
}
class greet2 extends greet1{
    greet2(){
        System.out.println("Good evening");
    }
}
public class Single_Inheritace1 {
    public static void main(String[] args) {
        greet2 g2 = new greet2();
    }
}
