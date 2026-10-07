package model;

public class JenisKuliner extends JenisUsaha {

    public JenisKuliner(String namaJenis) {
        super(namaJenis);
    }
    
    @Override
    public String getKategori() {
        return "Kuliner";
    }
}