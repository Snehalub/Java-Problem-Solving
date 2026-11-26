import java.util.Scanner;

class program20
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'a';

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
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