public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double getKomisi() {
        return komisi;
    }

    public double gaji() {
        return penjualan * komisi;
    }

    public String toString() {
        return 
        "\n========================================" + 
        "\n============= Data Sales ===============" +
        "\n========================================" +
        "\nSales\t\t: "+ super.toString() + 
        "\nTotal Penjualan\t: " + String.format("%.1f", (double)penjualan) + 
        "\nBesaran Komisi\t: " + String.format("%.1f", komisi) + 
        "\nPendapatan\t: Rp "+ String.format("%.0f", gaji());
}
    
}
