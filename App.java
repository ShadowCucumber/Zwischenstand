import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Lehrer l1 = new Lehrer("Maria", "Brot", 30,"3000 Euro", false);
        Schueler s1 = new Schueler("Max", "Mustermann", 16, "Englisch", true, 100);
        Schueler s2 = new Schueler("Max", "Mustermann", 16, "Englisch", true, 100);

        if (s1.getHatUnterricht()==true) {
            System.out.println("Schueler hat Unterricht.");
        }
        
        if (s1.getHatUnterricht()==true) {
            l1.setArbeitet(true);
            System.out.println("Schueler hat Unterricht und Lehrer arbeitet");
        }
        else if (s1.getHatUnterricht()==false) {
            l1.setArbeitet(false);
            System.out.println("Schueler hat keinen Unterricht und Lehrer arbeitet nicht.");
        }

        if (s1.getHatUnterricht()==true) 
        {
            System.out.println("Schueler hat Unterricht.");
        }
        else
        {
            System.out.println("Schueler hat keinen Unterricht.");
        } 
        
       
        
        menschenExample();
        
    }

    public static void menschenExample(){
        Schueler s1 = new Schueler("Max", "Mustermann", 16, "Englisch", true, 100);
        Schueler s2 = new Schueler("Max", "Mustermann", 16, "Englisch", true, 100);
        ArrayList<Mensch> menschen = new ArrayList<>();
        menschen.add(s1);
        menschen.add(s2);

        for (Mensch mensch : menschen) {
            mensch.showInfo();
        }
    }

}

