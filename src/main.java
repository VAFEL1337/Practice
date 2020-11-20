import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        for (int h = 0; h < 7; h++) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задачи: ");
        int number = in.nextInt();
        if (number > 7 || number < 1) {
            System.out.println("Нет такой задачи.");
        } else {
            switch (number) {
                case 1:
                    s50 n1 = new s50();
                    n1.s50();
                    break;
                case 2:
                    nomer2 n2 = new nomer2();
                    n2.s87();
                    break;
                case 3:
                    s124 n3 = new s124();
                    n3.s124();
                    break;
                case 4:
                    s145 n4 = new s145();
                    n4.s145();
                    break;
                case 5:
                    s194 n5 = new s194();
                    n5.s194();
                    break;
                case 6:
                    nomer3 n6 = new nomer3();
                    n6.num();
                    break;
                }
            }
        }
    }
}
