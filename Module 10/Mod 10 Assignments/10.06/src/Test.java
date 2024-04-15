public class Test {

    

    public static int recur(int n)
    {
         if(n < 3)
         {
              return 2;
         }
         else
         {
              return recur(n / 3) + 1;
         }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(recur(10));
    }
}
