public class MinumanAksi {
    public static void main(String[] args) {
        Minuman chocoOriginal = new Minuman();
        chocoOriginal.nama = "Choco Original 1";
        chocoOriginal.harga = 10000;
        chocoOriginal.kategori = "Choco Original";

        Minuman chocoOreo = new Minuman();
        chocoOreo.nama = "Choco Oreo 2";
        chocoOreo.harga = 10000;
        chocoOreo.kategori = "Choco Oreo";

        System.out.println(chocoOreo.harga);

        System.out.println(chocoOreo.harga + chocoOriginal.harga);
    }
}
