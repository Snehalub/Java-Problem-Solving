import java.util.Scanner;

class program5
{
    public static void main(String A[])
    {
        int i = 0;
        int n;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value of n");
        n = sobj.nextInt();

        for(i = 1; i <= n; i++)
        {
            System.out.println(i*10);
        }
    }
}