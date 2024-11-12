package Oct.ex_30102024;

public class Lab_Arrays_2D {
    public static void main(String[] args) {
        int[][] array_2D = new int[3][3];
        array_2D[0][0] = 10;
        array_2D[0][1] = 10;
        array_2D[0][2] = 10;

        array_2D[1][0] = 20;
        array_2D[1][1] = 20;
        array_2D[1][2] = 20;

        array_2D[2][0] = 30;
        array_2D[2][1] = 30;
        array_2D[2][2] = 30;

        for(int i = 0; i< array_2D.length; i++) {
            for (int j = 0; j < array_2D[i].length; j++) {
                System.out.print(array_2D[i][j]+" ");
            }
            System.out.println();
        }


    }
}
