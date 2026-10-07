package model;

public class UMKM implements InfoUMKM {

    private int idUMKM;
    private String namaUsaha;
    private String namaPemilik;
    private JenisUsaha jenisUsaha;
    private Event event;

    public UMKM(int idUMKM, String namaUsaha, String namaPemilik,
            JenisUsaha jenisUsaha, Event event) {

        this.idUMKM = idUMKM;
        this.namaUsaha = namaUsaha;
        this.namaPemilik = namaPemilik;
        this.jenisUsaha = jenisUsaha;
        this.event = event;
    }

    public int getIdUMKM() {
        return idUMKM;
    }

    public void setIdUMKM(int idUMKM) {
        this.idUMKM = idUMKM;
    }

    public String getNamaUsaha() {
        return namaUsaha;
    }

    public void setNamaUsaha(String namaUsaha) {
        this.namaUsaha = namaUsaha;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public JenisUsaha getJenisUsaha() {
        return jenisUsaha;
    }

    public void setJenisUsaha(JenisUsaha jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID UMKM      : " + idUMKM);
        System.out.println("Nama Usaha   : " + namaUsaha);
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Jenis Usaha  : " + jenisUsaha.getNamaJenis());
        System.out.println("Event        : " + event.getNamaEvent());
        System.out.println("Lokasi       : " + event.getLokasi());
    }
    
    public void tampilkanInfo(boolean detail) {

    System.out.println("ID UMKM      : " + idUMKM);
    System.out.println("Nama Usaha   : " + namaUsaha);
    System.out.println("Nama Pemilik : " + namaPemilik);
    System.out.println("Jenis Usaha  : " + jenisUsaha.getNamaJenis());

    if (detail) {
        System.out.println("Event        : " + event.getNamaEvent());
        System.out.println("Lokasi       : " + event.getLokasi());
    }
    }
}