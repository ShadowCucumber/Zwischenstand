public class WhileDoClass {
    
    public void gibAus(){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
    
    public static void main(String[] args){
        WhileDoClass dwc = new WhileDoClass();
        dwc.gibAus();
    }
}
