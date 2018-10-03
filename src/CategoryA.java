import java.util.Random;

public class CategoryA {
    public static String Task1(int[] a, int[] b, int[] c, int[] point){
        int checkA = (a[0] - point[0])*(b[1] - a[1]) - (b[0]-a[0])*(a[1] - point[1]);
        int checkB = (b[0] - point[0])*(c[1] - b[1]) - (c[0]-b[0])*(b[1] - point[1]);
        int checkC = (c[0] - point[0])*(a[1] - c[0]) - (a[0]-c[0])*(c[1] - point[1]);
        if ((checkA >= 0 && checkB >=0 && checkC >= 0) || (checkA <= 0 && checkB <= 0 && checkC <=0)){
            return "IN";
        } else {
            return "OUT";
        }

    }


    public static int Task2(int[][] matrix, int[] data){
        int f = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = data[f++];
            }
        }
        for (int[] anArr : matrix) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

        int n = matrix.length, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            count1 += matrix[i][i];     // Главная диагональ
        }
        for (int i = 0; i < n; i++){
            count2 += matrix[i][n-1-i];
        }
        return count1 - count2;
    }

    public static void Task3(int num){
        char[][] stair = new char[num][num];
        char space = ' ';
        char sharp = '#';


        for (int i = 0; i < stair.length; i++) {
            for (int j = 0; j < stair[i].length; j++) {
                if(i+j < stair.length-1){
                    stair[i][j] = space;
                }else {
                    stair[i][j] = sharp;
                }


            }
        }
        for (char[] anArr : stair) {
            for (char anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }

    }

    public static int Task4(int[] dataTask4, int k) {

        int count = 0;
        for (int i = 0; i < dataTask4.length; i++) {

            for (int j = 0; j < dataTask4.length; j++) {

                if ((dataTask4[j] + dataTask4[i]) % k == 0 && (dataTask4[i] < dataTask4[j])){
                    count++;

                }
            }
        }


        return count;
    }
}
