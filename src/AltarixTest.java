public class AltarixTest {
    public static void main(String[] args) {
        //CategoryA.Task1
        int[] a = {1,1};
        int[] b = {0,-1};
        int[] c = {-1,-1};
        int[] point = {-1,-1};
        System.out.println("CategoryA.Task1");
        System.out.println(CategoryA.Task1(a, b, c, point));
        System.out.println("");

        //CategoryA.Task2
        System.out.println("CategoryA.Task2");
        int[][] matrix = new int[3][3];
        int[] data = {1,3,8,9,2,1,0,3,7};
        System.out.println(CategoryA.Task2(matrix,data));
        System.out.println("");

        //CategoryA.Task3
        System.out.println("CategoryA.Task3");
        CategoryA.Task3(4);
        System.out.println("");

        //CategoryA.Task4
        System.out.println("CategoryA.Task4");
        int[] dataTask4 = {1,2,3,4,5,6};
        int k = 5;
        System.out.println(CategoryA.Task4(dataTask4, k));
        System.out.println("");

        //CategoryB.Task1
        System.out.println("CategoryB.Task1");
        String dataTaskB1 = "([][{}])[({})]({[]}){[()]";

        System.out.println(CategoryB.Task1(dataTaskB1));
        System.out.println("");

        //CategoryB.Task2
        System.out.println("CategoryB.Task2");
        int n = 3;
        int[] dataTaskB2 = {1, 5, 3, 2, 4, 3, 6, 7, 8};

        CategoryB.Task2(n, dataTaskB2);
        System.out.println("");

        //CategoryC.SimpleCalculator
        System.out.println("CategoryC.SimpleCalculator");
        CategoryC calculator = new CategoryC();
        calculator.calc();

    }
}
