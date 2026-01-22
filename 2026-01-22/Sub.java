import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        String ageStr = sc.nextLine();
        int age = Integer.parseInt(ageStr);

        System.out.print("학생이신가요? (Y, N)");
        String student = sc.nextLine();

        if (age >= 65 || student.equals("Y")) {
            System.out.println("할인 대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }

    }
}