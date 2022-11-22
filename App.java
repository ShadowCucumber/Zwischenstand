public class App {
    public static void main(String[] args) throws Exception {
        
        Lehrer l1 = new Lehrer("Maria", "Brot", 30,"3000 Euro", false);
        Schueler s1 = new Schueler("Max", "Mustermann", 16, "Englisch", true);

        if (s1.getHatUnterricht()==true) {
            l1.setArbeitet(true);
            System.out.println("Schueler hat Unterricht und Lehrer arbeitet");
        }else{
            System.out.println("Schueler hat kein Unterricht und Lehrer arbeitet nicht.");
        }
        
    }
}
