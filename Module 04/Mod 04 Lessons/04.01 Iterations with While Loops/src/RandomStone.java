public class RandomStone {
    public static void main(String[] args)
    {
        int n = 0;
        while (n < 20)
        {
            int randomInt = (int) (Math.random()*10+1);
            System.out.println(randomInt);

            if (randomInt <= 4)
            {
                System.out.println("Purple Stone");
            }

            else
            {
                System.out.println("Yellow Stone");
            }
            n++;
        }
    }
}
