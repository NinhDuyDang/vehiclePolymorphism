import car.Car;
import train.Train;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Oto");
            System.out.println("2. Tau hoa");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    menuOto();
                    break;
                case 2:
                    menuTauHoa();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Please choose again.");
            }
        }
    }

    private static void menuOto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so o to :");
        int numOto = scanner.nextInt();
        scanner.nextLine();
        Car[] oto = new Car[numOto];
        for (int i = 0; i < numOto; i++) {
            oto[i] = new Car();
            oto[i].input();
        }
        for (Car otos : oto) {
            otos.info();
        }
    }

    private static void menuTauHoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tau");
        int numTau = scanner.nextInt();
        scanner.nextLine();
        Train[] tauhoa = new Train[numTau];
        for (int i= 0; i < numTau; i++){
            tauhoa[i] = new Train();
            tauhoa[i].input();
        }
        for (Train tauHoas : tauhoa){
            tauHoas.info();
        }
    }




}
