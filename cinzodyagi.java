import java.util.Scanner;
public class cinzodyagi {
    public static void main(String[] args) {
        System.out.println("Doğduğun yılı gir :");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        switch (year % 12) {
            case 0:
                System.out.println("maymun");
                break;
            case 1:
                System.out.println("horoz");
                break;
            case 2:
                System.out.println("köpek");
                break;
            case 3:
                System.out.println("domuz");
                break;
            case 4:
                System.out.println("fare");
                break;
            case 5:
                System.out.println("öküz");
                break;
            case 6:
                System.out.println("kaplan");
                break;
            case 7:
                System.out.println("tavşan");
                break;
            case 8:
                System.out.println("ejderha");
                break;
            case 9:
                System.out.println("yılan");
                break;
            case 10:
                System.out.println("at");
                break;
            case 11:
                System.out.println("koyun");
                break;

        }

    }
}
