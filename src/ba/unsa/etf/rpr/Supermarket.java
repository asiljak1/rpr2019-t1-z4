package ba.unsa.etf.rpr;

public class Supermarket {
    int br=0;
    Artikl[] artikli=new Artikl[1000];
    public Artikl[] getArtikli() {return artikli;}
    public void dodajArtikl(Artikl artikl) {
        artikli[br]=new Artikl(artikl.naziv,artikl.cijena, artikl.kod);
        br=br+1;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0;i<br;i=i+1) {
            if(artikli[i].kod.equals(kod)) {
                Artikl izbaceni=new Artikl(artikli[i].naziv, artikli[i].cijena, artikli[i].kod);
                for(int j=i;j<br-1;j=j+1) artikli[j]=artikli[j+1];
                br=br-1;
                artikli[br]=null;
                return izbaceni;
            }
        }
        return null;
    }
}
