import Oto.Oto;
import Tau.TauHoa;

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
        Oto[] oto = new Oto[numOto];
        for (int i = 0; i < numOto; i++) {
            oto[i] = new Oto();
            oto[i].input();
        }
        for (Oto otos : oto) {
            otos.info();
        }
    }

    private static void menuTauHoa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so tau");
        int numTau = scanner.nextInt();
        scanner.nextLine();
        TauHoa[] tauhoa = new TauHoa[numTau];
        for (int i= 0; i < numTau; i++){
            tauhoa[i] = new TauHoa();
            tauhoa[i].input();
        }
        for (TauHoa tauHoas : tauhoa){
            tauHoas.info();
        }
    }




}
