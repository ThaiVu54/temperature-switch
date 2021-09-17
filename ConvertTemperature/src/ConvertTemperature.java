import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doC, doF;
        int choice;
        do {
            System.out.println("menu:");
            System.out.println("1. chuyển độ F sang độ C");
            System.out.println("2. chuyển độ C sang độ F");
            System.out.println("0. thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("nhập độ F");
                    doF = sc.nextDouble();
                    System.out.print("độ F chuyển sang độ C: "+fsangC(doF));
                    break;
                case 2:
                    System.out.println("nhập độ C");
                    doC = sc.nextDouble();
                    System.out.print("độ C chuyển sang độ F: "+fsangC(doC));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double cSangF(double doC){
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double fsangC(double doF){
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
