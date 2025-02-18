public class MataKuliahMain12 {

    public static void main(String[] args) {
        MataKuliah12 BasisData = new MataKuliah12();
        BasisData.kodeMK = "KM184722";
        BasisData.nama = "Basis Data";
        BasisData.sks = 2;
        BasisData.jumlahJam = 4;

        BasisData.tampilkanInformasi();
        BasisData.ubahSKS(3);
        BasisData.tambahJam(2);
        BasisData.kurangiJam(1);
        BasisData.tampilkanInformasi();
    }
}