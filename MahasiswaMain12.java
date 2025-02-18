public class MahasiswaMain12 {
        String nama;
        String nim;
        String kelas;
        double ipk;
    
        void tampilkanInformasi(){
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
        }
        void ubahKelas(String kelasBaru){
            kelas = kelasBaru;
    
        }
        void updateIPK(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            } else {
                System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0!");
            }
        }
    
    public static void main(String[] args) {

        MahasiswaMain12 mhs1 = new MahasiswaMain12 ();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();


    }
    
}
