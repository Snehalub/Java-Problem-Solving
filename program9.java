import java.util.Scanner;

class program9
{
    public static void main(String A[])
    {
        int i = 0;
        int iSum = 0;
        int n = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value of n");
        n = sobj.nextInt();

        for(i = 1; i <= n; i++)
        {
            iSum = iSum + i;
        }
        System.out.println(iSum);
    }
}