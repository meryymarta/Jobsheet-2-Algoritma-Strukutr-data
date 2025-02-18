public class DosenMain12 {

    public static void main(String[] args) {
        Dosen12 dosen = new Dosen12();
        dosen.idDosen = "D1256YHJ";
        dosen.nama = "Khusna Aliyah ST. MT";
        dosen.statusAktif = true;
        dosen.tahunBergabung = 2019;
        dosen.bidangKeahlian = "Basis Data";
        dosen.masaKerja = dosen.hitungMasaKerja(2025);
        
        dosen.tampilkanInformasi();
        dosen.setStatusAktif(false);
        dosen.masaKerja = dosen.hitungMasaKerja(2025);
        dosen.ubahKeahlianBidang("Teknik Informatika");
        dosen.tampilkanInformasi();

        Dosen12 dosen2 = new Dosen12 ("SQA678", "Alya Rahmah S.T", true,  2017, "Teknik Informatika" );
        dosen2.tampilkanInformasi();
    }

}