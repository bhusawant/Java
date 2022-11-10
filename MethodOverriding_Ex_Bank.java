class Banking{
    void rateOfInterest(){
        System.out.println("RBI rate of interest = 5.90%");
    }
}
class PNB extends Banking{
    void rateOfInterest(){
        System.out.println("PNB rate of interest = 6.30%");
    }
}
class SBI extends Banking{
    void rateOfInterest(){
        System.out.println("SBI rate of interest = 8.55%");
    }
}
class BOI extends Banking{
    void rateOfInterest(){
        System.out.println("BOI rate of interest = 4.95%");
    }
}
public class MethodOverriding_Ex_Bank {
    public static void main(String[] args) {
        Banking bank = new BOI();
        bank.rateOfInterest();
    }
}
