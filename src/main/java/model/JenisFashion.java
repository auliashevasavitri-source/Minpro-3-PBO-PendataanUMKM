package model;

public class JenisFashion extends JenisUsaha {

    public JenisFashion(String namaJenis) {
        super(namaJenis);
    }
    
    @Override
    public String getKategori() {
        return "Fashion";
    }
}