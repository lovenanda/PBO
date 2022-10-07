public class SimCard {

    private int nomor_hp;
    private int pulsa;

    public SimCard(int nomor_hp){
        this.nomor_hp = nomor_hp;
    }

    public void isi_ulang(int nominal){
        this.pulsa += nominal;
        System.out.println("Berhasil Mengisi Pulsa Sebesar "+nominal+"\n");
    }

    public void telp(int durasi){
        int biaya;
        if (durasi<60){
            biaya = durasi * 5; 
        }else{
            int durasi_menit = durasi / 60;
            biaya = 500 * durasi_menit;
        }
        if (biaya>pulsa){
            System.out.println("Maaf Pulsa Anda Tidak Cukup\n");
        }else{
            pulsa -= biaya;
            System.out.println("Telah melakukan Telephone Pulsa anda terpotong : "+biaya+"\n");
        }
    }
    
    public void sms(){
        int biaya = 350;
        if (biaya>pulsa){
            System.out.println("Maaf Pulsa Anda Tidak Cukup\n");
        }else{
            pulsa -=biaya;
            System.out.println("Telah melakukan SMS Pulsa anda terpotong : "+biaya+"\n");
        }
    }

    public void cek_pulsa(){
        System.out.println("Nomor :"+this.nomor_hp );
        System.out.println("Pulsa anda sisa : "+this.pulsa+"\n");
    }
    
}