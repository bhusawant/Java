import java.util.*;
public class pattern{
    public static void main(String args[]){
        int i,j,k,m,n;
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1;i<=n;i++)
        {
            for(j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(m=i-1;m>0;m--)
            {
                System.out.print(m);
            }
            System.out.print("\n");
        }
    }
}