import javax.swing.plaf.IconUIResource;

public class continue3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 15) {
            i++;
            if (i<5 || i>12) {
                continue;
            }
            System.out.println(i);
        }
    }
}
