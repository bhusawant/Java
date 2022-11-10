// package college;

public class gross{
    public static void main(String args[]){
        int employee_no = 25, basic = 25000;
        double da,hra,gross;
        da = basic*(0.2);
        hra = basic*(0.05);
        gross = basic+da+hra;
        System.out.println("Employee name: Harsh\nemployee no: "+employee_no+"\ngross salary: "+gross);
    }
}