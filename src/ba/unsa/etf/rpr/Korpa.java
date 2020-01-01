package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli=new Artikl[50];
    int br=0;

    public boolean dodajArtikl(Artikl a) {
        if (br==50) return false;
        artikli[br]=new Artikl(a.naziv,a.cijena,a.kod);
        br=br+1;
        return true;
    }
    public Artikl[] getArtikli() {
        return artikli;
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
    public int dajUkupnuCijenuArtikala() {
        int ukupna=0;
        for(int i=0;i<br;i=i+1) {
            ukupna=ukupna+artikli[i].cijena;
        }
        return ukupna;
    }
}
