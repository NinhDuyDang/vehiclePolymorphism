package car;

import vehicle.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    private String loaixe;
@Override
public void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap loai xe:  ");
    loaixe = scanner.nextLine();
    System.out.println("giave la: ");
    giave = scanner.nextLine();
    System.out.println(("so ghe la"));
    soghe = scanner.nextLine();

}
    @Override
    public void info() {
        System.out.println("Sô ghê la"+ soghe + "gia ve la" +giave + "loai xe la: "+loaixe);
    }



}
