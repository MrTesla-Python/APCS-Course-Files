public class Test {
    public static String money( int n )
    {
      double money = n;
      return "$"+money;
    }
    
    public static String money( double d )
    {
      d = Math.round(d * 100) / 100.0;
      return "$"+d;
    }
    
    public static String money( String s )
    {
      double money = Double.parseDouble(s);
      money = Math.round(money * 100.0) / 100.0;
      return "$"+money;
    }
    
    public static void main( String[] args )
    {
      System.out.println( money( "2.538" ) );
    }
}
