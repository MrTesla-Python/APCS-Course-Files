 public class FindMinMax
{
    public static void main(String[] args)
    {
        int [] numList = {3, 99, -1, 5, -10};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numList.length; i++)
        {
            if (numList[i] < min)
                min = numList[i];
            if (numList[i] > max)
                max = numList[i];
        }
        System.out.println("Minimum value is " + min);
        System.out.println("Maximum value is " + max);
    }  
}