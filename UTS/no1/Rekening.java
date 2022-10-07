public class Rekening {
    private String name;
    private int nomor_rekening;
    private int saldo;

    public Rekening(int nomor_rekening, String name){
        this.nomor_rekening = nomor_rekening;
        this.name = name;
    }

    public void menabung(int nominal){
        this.saldo += nominal;
        System.out.println("Berhasil Menabung Ke Rekening "+this.nomor_rekening);
        System.out.println("Sebesar : "+nominal);
        System.out.println();
    }
    
    public void tarik_tunai(int nominal){
        if (nominal > saldo){
            System.out.println("Maaf Saldo Anda Tidak Mencukupi");
            System.out.println();
        }else{
            this.saldo -= nominal;
            System.out.println("Berhasil Menarik Saldo Sebesar "+nominal);
            System.out.println("Pada Rekening :"+this.nomor_rekening);
            System.out.println();
        }
    }
    
    public void cek_saldo(){
        System.out.println("Nama Pemilik : "+this.name);
        System.out.println("Nomor Rekening : "+this.nomor_rekening);
        System.out.println("Saldo : "+this.saldo);
        System.out.println();
    }
    
}
