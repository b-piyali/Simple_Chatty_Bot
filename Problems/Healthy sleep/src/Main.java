import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minHours = scanner.nextInt();
        int maxHours = scanner.nextInt();
        int actualHours = scanner.nextInt();
        if (actualHours < minHours) {
            System.out.println("Deficiency");
        } else if (actualHours > maxHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}