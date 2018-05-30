public class Main {
    public static void main(String[] args) {

        IFactory phoneFactory=new AbstarctFactory().factory("Phone");
        IFactory displayFactory=new AbstarctFactory().factory("Display");
        IDisplay display1=displayFactory.display("Lg");
        IDisplay display2=displayFactory.display("Sony");
        display1.showDisplay();
        display2.showDisplay();
        ITelephone telephone1=phoneFactory.phone("Samsung");
        ITelephone telephone2=phoneFactory.phone("Nokia");
        telephone1.showName();
        telephone2.showName();




    }
}
