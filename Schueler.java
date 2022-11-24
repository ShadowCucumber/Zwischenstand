public class Schueler extends Mensch{
    String Schulfach;
    boolean HatUnterricht;
    int IQ;

    public boolean getHatUnterricht() {
        return HatUnterricht;
    }

    public void setHatUnterricht(boolean hatUnterricht) {
        HatUnterricht = hatUnterricht;
    }

    public String getSchulfach() {
        return Schulfach;
    }

    public void setSchulfach(String schulfach) {
        Schulfach = schulfach;
    }
    public int getIQ() {
        return IQ;
    }

    public void setIQ(int iQ) {
        IQ = iQ;
    }

    public Schueler(String vorname, String nachname, int alter, String schulfach, boolean hatUnterricht, int iq) {
        super(vorname, nachname, alter);
        setSchulfach (schulfach);
        setHatUnterricht (hatUnterricht);
        setIQ (iq);
    }

    public void showInfo(){
        System.out.println(getVorname()+" "+getNachname()+" "+getAlter()+" "+getSchulfach()+" "+getHatUnterricht()+" "+getIQ());
    }

}
