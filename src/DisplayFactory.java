public class DisplayFactory implements IFactory {
    @Override
    public IDisplay display(String typeDisplay){
        switch (typeDisplay){
            case "Lg":
                return new Lg();
            case "Sony":
                return new Sony();
            default:
                return null;
        }
    }
     @Override
    public ITelephone phone(String typePhone) {
        return null;
    }
}
