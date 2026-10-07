package model;

public abstract class JenisUsaha {

    private String namaJenis;

    public JenisUsaha(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }
    public abstract String getKategori();
}