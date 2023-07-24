public class Test {
    public static void main(String[] args) throws Exception {
        String str = "APCS";
        String str1 = "" + str.charAt(0);
        String str2 = "" + str.charAt(0);
        System.out.println("The string values: " + str1 + " and " + str2);
        System.out.println(" str1 == str2 : " + (str1 == str2) );
        System.out.println(" str1.equals(str2) : " + str1.equals(str2) );

        String courseName = "AP Computer Science A";
        if(courseName == "AP Computer Science A")
        {
            System.out.println("You are in the right class.");
        }
        else
        {
            System.out.println("Better check your schedule.");
        }
    }
}
