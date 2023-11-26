package View;

import Model.ModelKamera;
import Node.NodeKamera;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewKamera {

    public static void cetakALLKamera(ArrayList<NodeKamera> Kamera) {
        for (int i = 0; i < Kamera.size(); i++) {
            System.out.println("Kode kamera " + Kamera.get(i).Kode_Kamera);
            System.out.println("Merk kamera " + Kamera.get(i).Merk_kamera);
            System.out.println("Asal Kamera " + Kamera.get(i).Asal);
            System.out.println("Stok Kamera " + Kamera.get(i).stok_Kamera);
            System.out.println("----------------------------------------");
        }
    }

    public static void insertKamera(ModelKamera modelKamera) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan Merk Kamera : ");
        String Merk = input.nextLine();
        System.out.println("nasukan Asal Kamera : ");
        String Asal = input.nextLine();
        modelKamera.insertKamera(Merk, Asal);
    }

    public void cetakKamera(ModelKamera modelKamera) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan Merk Kamera : ");
        String Merk = input.nextLine();
        NodeKamera Kamera = (NodeKamera) modelKamera.SearchKamera(Merk);
        if (Kamera != null) {
            System.out.println("Kode Kamera " + Kamera.Kode_Kamera);
            System.out.println("Merk Kamera " + Kamera.Merk_kamera);
            System.out.println("Asal Kamera " + Kamera.Asal);
        } else {
            System.out.println("jenis kamera tidak ada");
        }
    }
    public  void updateStockKamera(ModelKamera modelKamera){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan Merk Kamera : ");
        String Merk = input.nextLine();
        System.out.println("Stock Kamera baru : ");
        int newStock = Integer.parseInt((input.nextLine()));
        modelKamera.updateStock(newStock,Merk);
    }
}