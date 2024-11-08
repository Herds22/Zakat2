public class Main {
    public static void main(String[] args) {
        Donatur donatur1 = new Donatur("Heru", "Magetan", "08237698234", 2000000);
    
        System.out.println("Donatur 1:");
        donatur1.setNama("Yura");
        donatur1.setAlamat("Ponorogo");
        donatur1.setnoTelpon("72356790182");
        donatur1.setJumlahZakat(3000000);
        donatur1.tampilkanInfo();
        System.out.println();

        System.out.println("Donatur 2;");
        Donatur donatur2 = new Donatur("Budi", "Pacitan", "0038293923932", 4000000);
        donatur2.tampilkanInfo();
        

        System.out.println();
  
        Penerima penerima1 = new Penerima("Ramadani", "Magetan", "085387439282", "Bantuan Sembako");  
        
        System.out.println("Penerima 1:");
        penerima1.setNama("Nugroho");
        penerima1.setAlamat("Madiun");
        penerima1.setnoTelpon("089234567812");
        penerima1.tampilkanInfo();
        System.out.println();


        System.out.println("Penerima 2:");
        Penerima penerima2 = new Penerima("Dani", "Ponorogo", "0853874393332", "Bantuan Sembako");  
        penerima2.tampilkanInfo();
        System.out.println();
        

        System.out.println("Pembayaran zakat oleh " + donatur1.getNama() + " dan " + donatur2.getNama() + " untuk " + penerima1.getNama() + " dan " + penerima2.getNama());
        System.out.println("Jumlah zakat yang dibayarkan: " + donatur1.getJumlahZakat() + " dan " + donatur2.getJumlahZakat());
        
    }
}
