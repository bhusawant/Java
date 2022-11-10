public class constructor_chaining1 {
    constructor_chaining1()
    {
        this(5);
        System.out.println("The default constructor");
    }
    constructor_chaining1(int x)
    {
        this(5, 15);
        System.out.println(x);
    }
    constructor_chaining1(int x, int y)
    {
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        new constructor_chaining1();
    }
}
