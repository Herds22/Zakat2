class Donatur {
    private String nama;
    private String alamat;
    private String noTelepon;
    private double jumlahZakat;

    public Donatur(String nama, String alamat, String noTelepon, double jumlahZakat) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.jumlahZakat = jumlahZakat;
    }

    public void tampilkanInfo() {
        System.out.println("Informasi Donatur:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No Telepon: " + noTelepon);
        System.out.println("Jumlah Zakat: " + jumlahZakat);
    }


    public String getNama() {
        return nama;
    }

    public double getJumlahZakat() {
        return jumlahZakat;
    }
}

