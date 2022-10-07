public class App {
    public static void main(String[] args) {
        SimCard sim1 = new SimCard(628211);
        sim1.cek_pulsa();
        sim1.isi_ulang(5000);
        sim1.cek_pulsa();
        sim1.telp(300);
        sim1.cek_pulsa();
        sim1.sms();
        sim1.cek_pulsa();
        sim1.telp(600);
        sim1.cek_pulsa();
    }
}
