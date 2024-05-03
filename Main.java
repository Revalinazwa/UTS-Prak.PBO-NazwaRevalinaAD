interface KartuInfo{
    void infoKartu();
}

abstract class KT_Penduduk{
    private String nama;
    private String nik;
    private String ttl;
    private String jenisKel;
    private String alamat;

    public KT_Penduduk(String nama, String nik, String ttl, String jenisKel, String alamat){
        this.nama = nama;
        this.nik = nik;
        this.ttl = ttl;
        this.jenisKel = jenisKel;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNik(){
        return nik;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public String getTtl(){
        return ttl;
    }

    public void setTtl(String ttl){
        this.ttl = ttl;
    }

    public String getJenisKel(){
        return jenisKel;
    }

    public void setJenisKel(String jenisKel){
        this.jenisKel = jenisKel;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public abstract void infoKartu();
}

class K_IndonesiaSehat extends KT_Penduduk implements KartuInfo{
    private String noKIS;
    private String kelasFaskes;
    private String tempatFaskes;

    public K_IndonesiaSehat(String noKIS, String nama, String alamat, String ttl, String nik,
        String kelasFaskes, String tempatFaskes){
        super(nama, nik, ttl, null, alamat);
        this.noKIS = noKIS;
        this.kelasFaskes = kelasFaskes;
        this.tempatFaskes = tempatFaskes;
    }

    public String getNoKIS(){
        return noKIS;
    }

    public void setNoKIS(String noKIS){
        this.noKIS = noKIS;
    }

    public String getKelasFaskes(){
        return kelasFaskes;
    }

    public void setKelasFaskes(String kelasFaskes){
        this.kelasFaskes = kelasFaskes;
    }

    public String getTempatFaskes(){
        return tempatFaskes;
    }

    public void setTempatFaskes(String tempatFaskes){
        this.tempatFaskes = tempatFaskes;
    }

    @Override
    public void infoKartu(){
        System.out.println("Nomor Kartu  : " + getNoKIS());
        System.out.println("Nama         : " + getNama());
        System.out.println("Tanggal lahir: " + getTtl());
        System.out.println("Alamat       : " + getAlamat());
        System.out.println("NIK          : " + getNik());
        System.out.println("Kelas Faskes : " + getKelasFaskes());
        System.out.println("Tempat Faskes: " + getTempatFaskes());
    }
}

public class Main{
    public static void main(String[] args) {
        K_IndonesiaSehat ktp1 = new K_IndonesiaSehat("123456", "Revalinazwa", "Kota Bandung", 
        "Bandung, 22 Agustus 2000", "12233450", "1", "Apotek Kimia Farma");

        ktp1.infoKartu();
    }
}