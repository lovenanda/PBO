public class App {
    public static void main(String[] args) {
        Rekening nasabah1 = new Rekening(3248762, "Nanda Wijaya Putra");
        nasabah1.cek_saldo();
        nasabah1.menabung(500000);
        nasabah1.cek_saldo();
        nasabah1.tarik_tunai(400000);
        nasabah1.cek_saldo();
        nasabah1.tarik_tunai(200000);
        nasabah1.menabung(300000);
        nasabah1.cek_saldo();
        nasabah1.tarik_tunai(200000);
        nasabah1.cek_saldo();
    }
}
