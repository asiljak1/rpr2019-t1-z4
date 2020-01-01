package ba.unsa.etf.rpr;

public class Artikl {
    String naziv, kod;
    int cijena;
    Artikl(String naziv, int cijena, String kod) {
        this.naziv=naziv;
        this.kod=kod;
        this.cijena=cijena;
    }
    public String getNaziv() {return this.naziv;}
    public int getCijena() {return this.cijena;}
    public String getKod() {return this.kod;}
}
