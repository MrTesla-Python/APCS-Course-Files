public class test {
    public static void main(String[] args) {
        int[] a = {2,3,3,4,4,5,1,2,9,1};
        int c = 0;
        int b = 1;
        if (a.length > 0)
        {
            c = a[0];
        }
        while (b < a.length)
        {
            if (a[b] < c)
            {
                c = a[b];
            }
            b++;
        }
        System.out.println(c);
    }

}
