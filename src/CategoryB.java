import java.util.Stack;

public class CategoryB {
    public static String Task1(String str) {
        if (str.isEmpty())
            return "SUCCESS";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++){
                    char current = str.charAt(i);
            if (current == '{' || current == '(' || current == '['){
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']'){
                if (stack.isEmpty())
                    return "FAIL";
                char last = stack.peek();
                if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
                    stack.pop();
                else
                    return "FAIL";
            }
        }
        return stack.isEmpty() ? "SUCCESS" : "FAIL";
    }

    public static void Task2(int num, int[]mass2) {
        int m = num;
        int n = num;
        //Сортируем массив
        for(int i = mass2.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( mass2[j] > mass2[j+1] ){
                int tmp = mass2[j];
                mass2[j] = mass2[j+1];
                mass2[j+1] = tmp;
                }
            }
        }

        //Объявляем и инициализируем массив.
        int[][] array = new int[m][n];
        int g = 0;
        //Заполняем периметр массива по часовой стрелке.
        for (int y = 0; y < n; y++) {
            array[0][y] = mass2[g];
            g++;
        }
        for (int x = 1; x < m; x++) {
            array[x][n - 1] = mass2[g];
            g++;
        }
        for (int y = n - 2; y >= 0; y--) {
            array[m - 1][y] = mass2[g];
            g++;
        }
        for (int x = m - 2; x > 0; x--) {
            array[x][0] = mass2[g];
            g++;
        }

        //Периметр заполнен.


        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = mass2[g];
                }
            }
        }

        //Выводим массив в консоль.
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] < 10) {
                    System.out.print(array[x][y] + " ");
                } else {
                    System.out.print(array[x][y] + " ");
                }
            }
            System.out.println("");
        }
    }
    }


