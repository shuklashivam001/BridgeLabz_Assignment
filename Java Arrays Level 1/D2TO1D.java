import java.util.*;

public class D2TO1D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        int[] res = new int[rows*columns];
        int idx=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                res[idx++] = matrix[i][j];
            }
        }
        System.out.println("2D to 1D = "+Arrays.toString(res));
    }
}
