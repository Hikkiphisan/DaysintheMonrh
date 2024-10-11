import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        while (true) {
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            } else {
                System.out.println("Gia tri khong hop le");
            }
        }
        int daysinMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
              daysinMonth = 31;
             break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysinMonth = 30;
                break;
            case 2:
                daysinMonth = 28; 
                break;
            default:
                daysinMonth = 0;
        }
        System.out.println("Tháng " + month + " có " + daysinMonth + " ngày.");
    }
}
