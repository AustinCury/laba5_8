import java.util.Scanner;
public class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть додатнє тризначне число:");
        int n = scanner.nextInt();
        if (n < 100 || n > 999){
            System.out.print("Нерпавильне введене число!");
        }else {
            int a, b, c;
            a = n / 100;
            b = (n - a * 100) / 10;
            c = n - (a * 100 + b * 10);

            if (a > b) {
                if (a > c) {
                    System.out.print(a + "-найбільше число");
                } else {
                    System.out.print(c + "-найбільше число");
                }
            } else if (b > c) {
                System.out.print(b + "-найбільше число");
            } else {
                System.out.print(c + "-найбільше число");
            }
        }
    }
}
