public class DosenMain12 {

    public static void main(String[] args) {
        Dosen12 dosen = new Dosen12();
        dosen.idDosen = "D1256YHJ";
        dosen.nama = "Khusna Aliyah ST. MT";
        dosen.statusAktif = true;
        dosen.tahunBergabung = 2019;
        dosen.bidangKeahlian = "Basis Data";
        dosen.masaKerja = 6;
        
        dosen.tampilkanInformasi();
        dosen.setStatusAktif(false);
        dosen.masaKerja = dosen.hitungMasaKerja(2025, 2019);
        dosen.ubahKeahlianBidang("Teknik Informatika");
        dosen.tampilkanInformasi();
    }
}