public class PegawaiTetap extends Pegawai{
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public double gaji() {
        return upah;
    }

    public String toString() {
        return 
        "\n========================================" + 
        "\n========== Data Pegawai Tetap ==========" +
        "\n========================================" + 
        "\nPegawai Tetap\t: "+super.toString() + 
        "\nUpah\t\t: " + String.format("%.1f", upah) + 
        "\nPendapatan\t: Rp "+ String.format("%.0f", gaji());
    }

}
