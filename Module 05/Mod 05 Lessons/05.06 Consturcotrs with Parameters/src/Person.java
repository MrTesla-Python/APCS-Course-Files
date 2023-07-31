  public class Person
  {
    private double myHeight;
    private double myWeight;
    private String myHair;

    public Person( double height, double weight, String hair ) 
    {
      myHeight = height;
      myWeight = weight;
      myHair = hair;
    }

    public void sleep( int hours )
    {
      for ( int i = 0 ; i < hours ; i++ )
        System.out.println( "Sleeping ... " );
    }

    public void talk()
    {
      myWeight -= 0.01;
      System.out.println( "Talking ... " );
    }

    public void eat()
    {
      myWeight += 0.5;
      System.out.println( "Eating ... " );
    }

    public void walk( int meters )
    {
      myWeight -= 0.05 * meters / 1000;
      System.out.println( "Walking ... " );
    }

    public void lecture()
    {
      for ( int i = 0 ; i < 10 ; i++ )
      {
        talk();
      }
    }
}