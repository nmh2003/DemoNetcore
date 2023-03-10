package Demo.BaiThucHanhLab2;

public class Bai11 {
    public static void main(String[] args) {
        int n, temp, max = 100;
        Scanner scanner = new Scanner(System.in);
            
        int A[] = new int[max];
        
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 2 || n > max-1);
            
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
            
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
            
            for (int j = i+1; j <= n - 1; j++) {
                if (A[j] < A[i]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
            
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
