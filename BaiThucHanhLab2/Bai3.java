package Demo.BaiThucHanhLab2;

public class Bai3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập năm sinh: ");
        year = scanner.nextInt();
         
        age = 2023 - year;  // 2023 là năm hiện tại
        if (age < 16) {
            ageGroup = "vị thành niên.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuổi trưởng thành.";
        } else {
            ageGroup = "đã già";
        }
         
        System.out.println("Bạn " + name + " ở độ tuổi " + ageGroup);
    }

 
}
}
