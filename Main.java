public class Main {
    public static void main(String[] args) {
        Donatur donatur1 = new Donatur("Heru", "Magetan", "08237698234", 2000000);
        donatur1.tampilkanInfo();  
        System.out.println();
        
  
        Penerima penerima1 = new Penerima("Ramadani", "Magetan", "085387439282", "Bantuan Sembako");  
        penerima1.tampilkanInfo();
        System.out.println();
        
        Penerima penerima2 = new Penerima("Dani", "Ponorogo", "0853874393332", "Bantuan Sembako");  
        penerima2.tampilkanInfo();
        System.out.println();
        

        System.out.println("Pembayaran zakat oleh " + donatur1.getNama() + " untuk " + penerima1.getNama() + " dan " + penerima2.getNama());
        System.out.println("Jumlah zakat yang dibayarkan: " + donatur1.getJumlahZakat());
        
    }
}