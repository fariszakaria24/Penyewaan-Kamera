import Controller.ControllerKamera;
import Controller.ControllerKamera;
import Database.ALLModel;
import Model.ModelKamera;
import View.ViewKamera;
import View.ViewKamera;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void insertStaticKamera(){
        ALLModel.Kamara.insertKamera("CANON","JEPANG");
        ALLModel.Kamara.insertKamera("SAMSUNG","KOREA");
    }

    static void menu_utama(){
        Scanner input = new Scanner(System.in);
        ViewKamera viewKamera = new ViewKamera();
        ControllerKamera controlKamera = new ControllerKamera(ALLModel.Kamara,viewKamera);
        System.out.println("PROGRAM SEWA KAMERA");
        System.out.println();

        int pil_menuUtama = 0;
        while (pil_menuUtama != 6){
            System.out.println("Menu Utama ");
            System.out.println("1. Manajemen Kamera");
            System.out.println("2. Manajemen Pegawai");
            System.out.println("3. Manajemen Anggota");
            System.out.println("4. Transkasi Peminjaman");
            System.out.println("5. Transaksi Pengembalian");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("masukkan pilihan anda : ");
            pil_menuUtama = input.nextInt();
            switch (pil_menuUtama){
                case 1:
                    int pil_menuBuku = 0;
                    while (pil_menuBuku != 7)
                    {
                        System.out.println("anda masuk pilihan menu Manajemen kamera");
                        System.out.println("");
                        System.out.println("1. Cetak semua daftar kamera ");
                        System.out.println("2. Tambah kamera");
                        System.out.println("3. Update stok kamera");
                        System.out.println("4. Update data kamera");
                        System.out.println("5. Delete kamera");
                        System.out.println("6. Pencarian kamera");
                        System.out.println("7. Kembali ke Menu Utama");
                        System.out.print("masukkan pilihan : ");
                        pil_menuBuku = input.nextInt();
                        switch (pil_menuBuku){
                            case 1:
                                System.out.println(" daftar kamera ");
                                controlKamera.viewAllKamera();
                                break;
                            case 2:
                                System.out.println(" tambah kamera ");
                                controlKamera.insertKamera();
                                break;
                            case 3:
                                System.out.println(" update stok buku ");
                                break;
                            case 4:
                                System.out.println(" update data buku ");
                                controlKamera.updateStockKamera();
                                break;
                            case 5:
                                System.out.println(" delete buku ");
                                break;
                            case 6:
                                System.out.println(" pencarian buku ");
                                controlKamera.viewKamera();
                                break;
                            case 7:
                                System.out.println(" kembali ke menu utama ");
                                break;
                        }
                    }

                    break;
                case 2:
                    System.out.println("anda masuk pilihan menu Manajemen Pegawai");
                    break;
                case 3:
                    System.out.println("anda masuk pilihan menu Menajemen Anggota");
                    break;
                case 4:
                    System.out.println("anda masuk pilihan menu Transaksi Peminjaman");
                    break;
                case 5:
                    System.out.println("anda masuk pilihan menu Transaksi Pengembalian");
                    break;
                case 6:
                    System.out.println("- EXIT -");
                    break;
                default:
                    System.out.println("pilihan tidak ada, silahkan masukkan pilihan lagi");
            }
        }
    }

    public static void main(String[] args){
        insertStaticKamera();
        menu_utama();

    }
}