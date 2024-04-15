public class MathMagic2 {
    public static void main(String[] args) throws Exception {
        int[] colHeader = {3, 6, 9};
        int[] rowHeader = {2, 4, 6, 8};
        int[][] test = calcMagicMath(rowHeader, colHeader);
        for (int i = 0; i < rowHeader.length; i++) {
            for (int j = 0; j < colHeader.length; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] calcMagicMath(int[] rowH, int[] colH) {
        int[][] ans = new int[rowH.length][colH.length];
        for (int j = 0; j < colH.length; j++) { 
            for (int i = 0; i < rowH.length; i++) {  
                ans[i][j] = rowH[i] * colH[j];
            }
        }
        return ans;
    }
}
