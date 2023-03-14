package Demo.BaiThucHanhLab2;

public class Bai12 {
    public static void main(String[] args) {
        int m, n;
             
        Scanner scanner = new Scanner(System.in);
             
        System.out.println("Nhập số dòng: ");
        m = scanner.nextInt();
        System.out.println("Nhập số cột: ");
        n = scanner.nextInt();
             
        int A[][] = new int[m][n];
             
        System.out.println("Nhập phần tử ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
             
        int max = A[0][0];
             
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }
             
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}
