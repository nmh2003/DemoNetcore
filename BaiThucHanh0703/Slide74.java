package Demo.BaiThucHanh0703;

public class Slide74 {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        int n, sum = 0;

        System.out.println("Nhập số phần tử trong mảng:");
        n = scaner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập gíá trị phần tử thứ %d trong mảng ", i);
            arr[i] = scaner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Tổng các số chia hết cho 2 là: " + sum);

    }
}
