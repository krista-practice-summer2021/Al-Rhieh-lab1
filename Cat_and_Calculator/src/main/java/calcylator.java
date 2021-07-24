import java.util.Scanner;

public class calcylator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your numbers and the operation with spaces between e.g 8 9 -");
        String calculation = scan.nextLine();
        String[] parts = calculation.split(" ");

        int part1 = Integer.parseInt(parts[0]);
        int part2 = Integer.parseInt(parts[2]);

        int answer = 0;
        String operation = parts[1];
        switch (operation) {
            case "+":
                answer = part1 + part2;
                break;
            case "-":
                answer = part1 - part2;
                break;
            case "/":
                answer = part1 / part2;
                break;
            case "*":
                answer = part1 * part2;
                break;
            default:
                throw new IllegalStateException("Incorrect operation : " + operation);

        }
     //   String ans= String.valueOf(answer);
        System.out.println(answer);

    }
1

}
