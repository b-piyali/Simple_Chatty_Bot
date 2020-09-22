import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int breakSegment = scanner.nextInt();
        if (breakSegment <= length * width && (breakSegment % length == 0 || breakSegment % width == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}