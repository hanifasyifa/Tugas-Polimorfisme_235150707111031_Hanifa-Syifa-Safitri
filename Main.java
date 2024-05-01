public class Main {
    public static void main(String[] args) {
        // obj PegawaiTetap
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Abe", "19474367278382", 2000000);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Alaia", "53477898290882", 6000000);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Kenkulus", "86975893292115", 4800000);

        // obj PegawaiHarian
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Chapaw", "7832873643744", 8500.0, 40);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Ebra", "0843784732782", 25000, 35);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Aca", "9254725108462", 60000, 50);

        // obj Sales
        Sales sales1 = new Sales("Ucel", "92838237273278", 50, 50000);
        Sales sales2 = new Sales("Jema", "83277377437432", 70, 9000);
        Sales sales3 = new Sales("Ayaya", "09433556666772", 35, 8900);

        // Menampilkan output
        System.out.println(pegawaiTetap1.toString());
        System.out.println(pegawaiTetap2.toString());
        System.out.println(pegawaiTetap3.toString());

        System.out.println(pegawaiHarian1.toString());
        System.out.println(pegawaiHarian2.toString());
        System.out.println(pegawaiHarian3.toString());

        System.out.println(sales1.toString());
        System.out.println(sales2.toString());
        System.out.println(sales3.toString());
    }

}
    

