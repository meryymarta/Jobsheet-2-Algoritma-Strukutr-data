public class Dosen12 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    int masaKerja;

    void tampilkanInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        if (statusAktif == true)
            System.out.println("Status: Aktif");
        else 
            System.out.println("Status: Tidak Aktif");

        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Masa Kerja: " + masaKerja);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
    }
    public int hitungMasaKerja(int tahunSekarang, int tahunBergabung){
    int masaKerja = tahunSekarang - tahunBergabung;
     return masaKerja;
        
    }
    void ubahKeahlianBidang(String Bidang) {
        bidangKeahlian = Bidang;
    }
}

    

