import java.util.Scanner;

class program17
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt = iCnt+2 )
        {
            System.out.print((iCnt)+"\t*\t");
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of elements");
        iValue = sobj.nextInt();

        Display(iValue);

    }
}