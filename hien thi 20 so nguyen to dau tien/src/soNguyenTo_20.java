public class soNguyenTo_20 {
    public static void main(String[] args) {
        int count = 0;
        int i;
        for (int N = 2; count < 20; N++) {
            boolean check = true;
            for (i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println(N + " ");
                count++;
            }
        }
    }
}