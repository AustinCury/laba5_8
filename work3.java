import java.util.Scanner;
public class work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть  1  - щоб піднятись вгору. \nВведіть 9 - щоб спуститись вниз.");
        int upOrDown = scanner.nextInt();
        if (upOrDown == 1){  // Підіймаємось вгору
            System.out.println("Який поверх вам потрібен?");
            int x = scanner.nextInt();
            if (x > 1 && x < 10){
                if (x == 2 || x == 3){
                    System.out.print("Ви піднялись на 3 поверх");
                }else {
                    System.out.print("Ви піднялись на " + x + " поверх");
                }
            }else {
                System.out.print("Доведеться йти сходами");
            }
        }else if (upOrDown == 9){  // Спускаємось вниз
            System.out.println("Який поверх вам потрібен?");
            int a = scanner.nextInt();
            if (a > 0 && a < 9){
                if (a == 1 || a == 2){
                    System.out.print("Ви спустились на 1 поверх");
                }else {
                    System.out.print("Ви спустились на" + a + " поверх");
                }
            }else {
                System.out.print("Доведеться йти сходами");
            }
        }else {  // go пішки
            System.out.print("Доведеться йти сходами");
        }
    }
}
