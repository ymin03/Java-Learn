import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String ageStr = sc.nextLine();
        int age = Integer.parseInt(ageStr);

        System.out.print("키를 입력하세요: ");
        String heightStr = sc.nextLine();
        int height = Integer.parseInt(heightStr);

        if (age >= 20 && height >= 170) {
            System.out.println("통과입니다");
        } else {
            System.out.println("불통과입니다");
        }


    }
}