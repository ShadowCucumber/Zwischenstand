import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Lehrer l1 = new Lehrer("Maria", "Brot", 30,"3000 Euro", false);
        Schueler s1 = new Schueler("Max", "Mustermann", 16, "Englisch", true);
        
        
        if (s1.getHatUnterricht()==true) {
            System.out.println("Schueler hat Unterricht.");
        }

        if (s1.getHatUnterricht()==true) {
            l1.setArbeitet(true);
            System.out.println("Schueler hat Unterricht und Lehrer arbeitet");
        }else{
        if (s1.getHatUnterricht()==false) {
            l1.setArbeitet(false);
            System.out.println("Schueler hat keinen Unterricht und Lehrer arbeitet nicht.");

        if (s1.getHatUnterricht()==true) {
            System.out.println("Schueler hat Unterricht.");
        }else{
            System.out.println("Schueler hat keinen Unterricht.");
        } 
        ArrayList<Schueler> schueler = new ArrayList<>();
        schueler.add(new Schueler("Mona", "Lisa", 15, "Mathe", true));
        schueler.add(new Schueler("Mona", "Lisa", 15, "Mathe", true));
        schueler.add(new Schueler("Mona", "Lisa", 15, "Mathe", true));
        schueler.add(s1);
        ge

    

        }
    }
}
}

