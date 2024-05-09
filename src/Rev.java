public class Rev
{
    static int rev(int n)

    {
        int rev=0;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static void main(String args[])
    {
        int n=321;
        System.out.println("reverse is " + rev(n));
    }
}
