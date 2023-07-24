package principlesOfOOP.task2;

public class Magazine implements Printable{
    private String magazinName;

    public Magazine(String magazinName){
        this.magazinName = magazinName;
    }

    @Override
    public void print() {
        System.out.println("Журнал - " + magazinName);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable printItem : printable) {
            if (printItem instanceof Magazine) {
                System.out.println("Magazine: " + ((Magazine) printItem).magazinName);
            }
        }
    }
}
