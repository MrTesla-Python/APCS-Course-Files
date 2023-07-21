/**
 * The PyTheorem class uses various Math class methods to calculate the hypotenuse
 * of a triangle using randomly generated sides a and b.
 *
 * @author Tristan Darnell
 * @version 07/23/23
 */
public class PyTheoremV1 {
    public static void main(String[] args) {
        int a1 = (int) (Math.random() * 18) + 5;
        int b1 = (int) (Math.random() * 18) + 5;
        double c1 = Math.sqrt((Math.pow(a1,2) + Math.pow(b1, 2)));
        
        System.out.println("Triangle 1 \t\tSide 1: " + a1 + "\t\t Side 2: " + b1 + "\t\t Hypotenuse: " + c1);

        int a2 = (int) (Math.random() * 19) + 5;
        int b2 = (int) (Math.random() * 19) + 5;
        double c2 = Math.sqrt((Math.pow(a2, 2) + Math.pow(b2, 2)));
        
        System.out.println("Triangle 2 \t\tSide 1: " + a2 + "\t\t Side 2: " + b2 + "\t\t Hypotenuse: " + c2);
    }
}

