import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число:");
        int a = scanner.nextInt();
        if (50 < a && a < 100){
            System.out.print("50<" + a + "<100");
        }else if (a <= 50){
            System.out.print(a + "<=50");
        }else if (a >= 100){
            System.out.print(a + ">=100");
        }else {
            System.out.print("Щось велике число)))");
        }
    }
}
