package Demo.BaiThucHanh2802;

public class Slide40 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Number: ");
        inputNumber = Slide40.scanner.nextInt();

        Slide40.RenderNgay(inputNumber);
    }
    public static void RenderNgay(int number) {
        if(number < 1 || number > 7) {
            System.out.println('Tybe number from 1 to 7 ');
        }
        switch (inputNumber >= 1 && inputNumber <= 7) {
            case 1:
            System.out.println('Monday ');
            case 2:
            System.out.println('Tuesday ');
                break;
            case 3:
            System.out.println('Wednesday ');
                break;
            case 4:
            System.out.println('Thursday ');
                break;
            case 5:
            System.out.println('Friday ');
                break;
            case 6:
            System.out.println('Saturday ');
                break;
            default:
                System.out.println("Sunday ");
}
