package Demo.BaiThucHanhLab2;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số n:");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " chẵn!");
        } else {
            System.out.println(n + " lẻ");
        }
    }
}
}
