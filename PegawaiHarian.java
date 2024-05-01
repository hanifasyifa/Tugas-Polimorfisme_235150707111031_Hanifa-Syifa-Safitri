public class PegawaiHarian extends Pegawai{

    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public double gaji() {
        if (totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            int jamNormal = 40;
            int jamLembur = totalJam - jamNormal;
            return (upahPerJam * jamNormal) + (jamLembur * upahPerJam * 1.5);
        }
    }

    public String toString() {
        return 
        "\n========================================" + 
        "\n========= Data Pegawai Harian ==========" +
        "\n========================================" + 
        "\nPegawai Harian\t: " + super.toString() + 
        "\nUpah per Jam\t: Rp " + String.format("%.1f", upahPerJam ) + 
        "\nTotal jam kerja\t: " + String.format("%.1f", (double)totalJam) + 
        "\nPendapatan\t: Rp " + String.format("%.0f", gaji());
        }
    
}
