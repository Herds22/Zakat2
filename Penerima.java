class Penerima {
    private String nama;
    private String alamat;
    private String noTelepon;
    private String jenisBantuan;

    public Penerima(String nama, String alamat, String noTelepon, String jenisBantuan) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.jenisBantuan = jenisBantuan;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Penerima:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No Telepon: " + noTelepon);
        System.out.println("Jenis Bantuan: " + jenisBantuan);
    }

    public String getNama() {
        return nama;
    }
}
