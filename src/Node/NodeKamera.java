package Node;

public class NodeKamera{
    public int kode_Kamera;
    public String Merk_kamera;
    public int stok_Kamera;
    public String Asal;
    public String Kode_Kamera;

    public NodeKamera(int kode_Kamera, String Merk_kamera, String Asal) {
        this.kode_Kamera = kode_Kamera;
        this.Merk_kamera = Merk_kamera;
        this.Asal = Asal;
    }

    public void updateStok(int newStok){
        this.stok_Kamera = this.stok_Kamera + newStok;
    }
}