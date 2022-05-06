//package .;


import java.util.ArrayList;

// dodawanie/ usuwanie można zrobić systemowo
// napisać własne porównywanie
public class Koszyk {
    private ArrayList<Produkt> produkty = new ArrayList<Produkt>();
    public ArrayList<Produkt> getProdukty() {
        return produkty;
    }
    public Koszyk(Produkt ...produkty){
        for (Produkt p:produkty){
            this.produkty.add(p);
        }
    }
    public void add(Produkt ...produkty){
        for (Produkt p:produkty){
            this.produkty.add(p);
        }
    }
    public void del(Produkt ...produkty){
        for (Produkt p:produkty){
            this.produkty.remove(p);
        }
    }
}