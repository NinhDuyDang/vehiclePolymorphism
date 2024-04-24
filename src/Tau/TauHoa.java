package Tau;

import PhuongTien.Phuongtien;

import java.util.Scanner;

public class TauHoa extends Phuongtien {
    private String Sotoa;
    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("so ghe la ");
        soghe = scanner.nextLine();
        System.out.print(" so toa la");
        Sotoa = scanner.nextLine();
        System.out.println("gia ve la ");
        giave = scanner.nextLine();
    }

    @Override
    public void info() {
        System.out.println("so ghe la: " + soghe + " So toa la  " + Sotoa + "gia ve la"+giave);
    }



}
