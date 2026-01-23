public class third {
    public static void main(String[] args) {
        int i = 1;
        while (i<=20){
            if (i % 3 == 0 && i % 5 != 0){
                System.out.println(i);
            }
            i++;
        }
//        int i = 1;
//        while (i <= 20) {
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    i++;       // ← 여기서 증가
//                    continue;
//                }
//                System.out.println(i);
//            }
//            i++;
//        }
    }
}
