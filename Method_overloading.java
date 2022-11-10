class Sum{
    static int add(int a, int b)
    {
        return a+b;
    }
    static int add(int a, int b, int c)
    {
        return a+b+c;
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        System.out.println("The sum of two numbers: ");
        System.out.println(Sum.add(15, 19));
        System.out.println("The sum of three numbers: ");
        System.out.println(Sum.add(45, 21, 36));
    }
}
