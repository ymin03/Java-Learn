import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        String ageStr = sc.nextLine();
        int age = Integer.parseInt(ageStr);
        System.out.print("키를 입력하세요: ");
        String heightStr = sc.nextLine();
        double height = Double.parseDouble(heightStr);

        System.out.println("이름 : "+ name + ", 나이 : " + age + ", 키: " + height);

        if (age >= 20 && height >= 170) {
            System.out.println("성인입니다.");
            System.out.println("키가 크시네요!");
        } else {
            System.out.println("조건 미달입니다..");
        }
    }
}