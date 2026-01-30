public class continue1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 5){
                i++; //야래 출력 무시(무한 출력이기에 증감식 작성)
                continue; //조건에 걸리면 아래 출력 무시 후 while로 돌아감
            }
            System.out.println(i);
            i++;
        }
    }
}
