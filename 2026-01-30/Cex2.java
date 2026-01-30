public class Cex2 {
    public static void main(String[] args) {
        //10까지의3의 배수의 합 출력
        int i = 0;
        int sum = 0;
        while (i < 10) {
            i++;
            if (i % 3 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
