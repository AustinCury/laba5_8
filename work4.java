import java.util.Scanner;
public class work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Погодитись? | Відмовитись?");
        String agreeOrRefuse = scanner.next();
        switch (agreeOrRefuse) {
            case "Так":
            case "Ya-ya":
            case "ОK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
            case "Nain":
                System.out.println("Я відмовляюсь!");
                break;
        }
    }
}
