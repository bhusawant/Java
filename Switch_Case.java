import java.util.*;
public class Switch_Case{
    public static void main(String args[]){
        int choice;
        System.out.println("1.Factorial\n2.Fibonacci\n3.Armstrong\n4.Sum of digits\nEnter your choice:");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice)
        {
            case 1: int i,n,fact=1;
                    System.out.print("Enter a number: ");
                    Scanner a = new Scanner(System.in);
                    n = a.nextInt();
                    for(i=1;i<=n;i++)
                    {
                        fact=fact*i;
                    } 
                    System.out.println("The factorial of "+n+" is "+fact);
                    break;
            case 2: int j,n1=0,n2=1,n3,num;
                    System.out.print("Enter the number of terms: ");
                    Scanner b = new Scanner(System.in);
                    num = b.nextInt();
                    System.out.println(n1+"\n"+n2);
                    for(j=1;j<=num-2;j++)
                    {
                        n3=n1+n2;
                        System.out.println(n3);
                        n1=n2;
                        n2=n3;
                    }
                    break;
            case 3: int sum,temp,rem,k;
                    System.out.println("The armstong numbers are:");
                    for(k=100;k<=500;k++)
                    {
                        temp = k;
                        sum = 0;
                        while(temp>0)
                        {
                            rem = temp%10;
                            sum = sum + rem*rem*rem;
                            temp = temp/10;
                        }
                        if(sum==k)
                        {
                            System.out.println(k);
                        }
                    }
                    break;
            case 4: int p,result = 0,r;
                    System.out.println("Enter a number: ");
                    Scanner c = new Scanner(System.in);
                    p = c.nextInt();
                    while(p>0)
                    {
                        r = p%10;
                        result = result + r;
                        p = p/10;
                    }
                    System.out.println("The sum of the digits is "+result);
                    break;
            default: System.out.println("Invalid choice");

        }
    }
}