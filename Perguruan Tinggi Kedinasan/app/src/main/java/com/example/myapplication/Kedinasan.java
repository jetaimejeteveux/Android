package com.example.myapplication;

public class Kedinasan {
    private String institusiId;
    private String institusiNama;
    private String institusiAlamat;
    private String institusiTentang;
    private String institusiWeb;

    public Kedinasan() {

    }

    public Kedinasan(String institusiId, String institusiNama, String institusiAlamat, String institusiTentang, String institusiWeb) {
        this.institusiId = institusiId;
        this.institusiNama = institusiNama;
        this.institusiAlamat = institusiAlamat;
        this.institusiTentang = institusiTentang;
        this.institusiWeb = institusiWeb;

    }

    public String getInstitusiId() {
        return institusiId;
    }

    public String getInstitusiNama() {
        return institusiNama;
    }

    public String getInstitusiAlamat() {
        return institusiAlamat;
    }

    public String getInstitusiTentang() {
        return institusiTentang;
    }

    public String getInstitusiWeb() {
        return institusiWeb;
    }
}

