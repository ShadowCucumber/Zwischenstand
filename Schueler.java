public class Schueler extends Mensch{
    String Schulfach;
    boolean HatUnterricht;

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

    public Schueler(String vorname, String nachname, int alter, String schulfach, boolean hatUnterricht) {
        super(vorname, nachname, alter);
        setSchulfach (schulfach);
        setHatUnterricht (hatUnterricht);
    }

}
