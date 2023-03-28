public abstract class Mensch {
    String Vorname;
    String Nachname;
    int Alter;
    
    public String getVorname() {
        return Vorname;
    }
    public void setVorname(String vorname) {
        Vorname = vorname;
    }
    public String getNachname() {
        return Nachname;
    }
    public void setNachname(String nachname) {
        Nachname = nachname;
    }
    public int getAlter() {
        return Alter;
    }
    public void setAlter(int alter) {
        Alter = alter;
    }
    
    public Mensch(String vorname, String nachname, int alter) {
        setVorname (vorname);
        setNachname (nachname);
        setAlter (alter);
    }

    public abstract void showInfo();
}


//test
