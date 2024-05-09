public class Max
{
    static int a[]={10,20,345,5654};
    static int max()
    {
        int max=a[0];
        for(int i=0 ;i<a.length; i++)

            if(a[i]>max)
            max = a[i];
        return max;
    }
    public static void main (String args[])
    {
       System.out.println(""+max());
    }
}
