public class Lehrer extends Mensch{
    String Gehalt;
    boolean Arbeitet;

    public String getGehalt() {
        return Gehalt;
    }

    public void setGehalt(String gehalt) {
        Gehalt = gehalt;
    }

    public boolean getArbeitet() {
        return Arbeitet;
    }

    public void setArbeitet(boolean arbeitet) {
        Arbeitet = arbeitet;
    }

    public Lehrer(String vorname, String nachname, int alter, String gehalt, boolean arbeitet) {
        super(vorname, nachname, alter);
        setGehalt (gehalt);
        setArbeitet (arbeitet);
    }
    public void showInfo(){
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getGehalt()+" "+getArbeitet());
    }
}
