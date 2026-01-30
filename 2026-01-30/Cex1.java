public class Cex1 {
    public static void main(String[] args) {
        int i = 0;
        while (i<20) {
            i++;
            if (i % 2 != 0){
                if (i == 15){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}
