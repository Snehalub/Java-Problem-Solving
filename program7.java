class program7
{
    public static void main(String A[])
    {
        int i = 0;
        int n = 0;

        for(i = 2; i <= 100; i++)
            {
                if(i <= 1 && n % i == 0)
                {
                    break;
                }
                else if(i == n)
                {
                    System.out.println(i);
                }
            }
    }
}