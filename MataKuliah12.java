public class MataKuliah12 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi(){
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);

    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        
    }
    void tambahJam(int Jam){
        jumlahJam += Jam;
    }
    void kurangiJam(int Jam){
        if (Jam <= jumlahJam){
            jumlahJam -= Jam;
         } else {
            System.out.println("Pengurangan tidak dapat dilakukan!");

            }
        }

            public MataKuliah12(){

            }
            public MataKuliah12(String km, String nama, int sks, int jumlahJam) {
                this.kodeMK = km;
                this.nama = nama;
                this.sks = sks;
                this.jumlahJam = jumlahJam;
            }
        }
        
    

    

