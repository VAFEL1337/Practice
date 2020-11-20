import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class s50 {

        public void s50(){

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размерность массива n ");

        int n = in.nextInt();
        int [][] mass= new int [n][n];

        out.println("\nИсходная матрица: ");

        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                mass[i][j] = rand.nextInt(9) + 1;
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }

        int max = mass[0][0];
        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                if (mass[i][j]>max){
                    max=mass[i][j];
                }
            }
        }

        out.println("\nМаксимальный элемент матрицы: " + max);

        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                if (mass[i][j] == max){
                    for (int q=0;q < n;q++){
                        if (mass[i][q] != max)
                            mass[i][q] = 0;
                        if (mass[q][j] != max)
                            mass[q][j] = 0;
                    }
                }
            }
        }

        out.println("\nМаска: ");

        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                if (mass[i][j] == max){
                    System.out.print(0+" ");
                }
                else {
                    System.out.print(mass[i][j]+" ");
                }
            }
            System.out.println( );
        }

        int x = 0, m = 0;

        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                if (!(mass[i][j] == 0 || mass[i][j] == max)) {
                    x++;
                    break;
                }
            }
            if (m < 1)
                for (int j=0;j < n;j++){
                    if (!(mass[i][j] == 0 || mass[i][j] == max)) {
                        m++;
                    }
                }
        }
        int [][] arr = new int [x][m];

        for (int i=0, q = 0;i < n;i++){
            for (int j=0, k = 0;j < n;j++){
                if (!(mass[i][j] == 0 || mass[i][j] == max)) {
                    arr[q][k++] = mass[i][j];
                }
            }
            for (int j=0;j < n;j++){
                if (!(mass[i][j] == 0 || mass[i][j] == max)) {
                    q++;
                    break;
                }
            }
        }

        out.println("\nРезультат: ");

        for (int i=0;i < x;i++){
            for (int j=0;j < m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}