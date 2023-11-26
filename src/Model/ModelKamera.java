package Model;

import Node.NodeKamera;
import java.util.ArrayList;

public class ModelKamera{
    public ArrayList<NodeKamera> Kamera;
    private int kode_update = -1;
    public ModelKamera(){
        this.Kamera = new ArrayList<>();
    }

    public void insertKamera(String Merk, String Asal){
        this.kode_update++;
        this.Kamera.add(new NodeKamera(this.kode_update, Merk, Asal));
    }

    public ArrayList<NodeKamera> viewKamera(){
        return Kamera;
    }

    public void updateStock(int newStock, String Merk){
        NodeKamera Kamera = SearchKamera (Merk);
        Kamera.updateStok(newStock);
    }
    public NodeKamera SearchKamera(String Merk){
        NodeKamera kamera =null;
        for (int i = 0; i < kamera.stok_Kamera; i++){
            if (Merk.equals(Kamera.get(i).Merk_kamera));
            kamera = Kamera.get(i);
        }
        return kamera;
    }
}