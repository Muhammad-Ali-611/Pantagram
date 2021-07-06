package Java;

public class Triangle {
    public static void main(String[] args) {

        int m, n, k=1;

        for (m = 0; m< 5; m++){
            for (n = 0; n<k; n++){
                System.out.print("* ");
            }
            k = k +2;
            System.out.println();
        }
    }
}
