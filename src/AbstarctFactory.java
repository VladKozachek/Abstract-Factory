public class AbstarctFactory {
    public IFactory factory(String typeFactory){
        switch (typeFactory){
            case "Phone":
                return  new PhoneFactory();
            case "Display":
                return new DisplayFactory();
                default:
                    return null;
        }
    }
}
