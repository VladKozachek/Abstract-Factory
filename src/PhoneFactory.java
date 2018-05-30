public class PhoneFactory  implements IFactory{
    public ITelephone phone(String typePhone){
        switch (typePhone){
            case "Samsung":
                return new Samsung();
            case "Nokia":
                return new Nokia();
                default:
                    return null;
        }
    }

    @Override
    public IDisplay display(String typeDisplay) {
        return null;
    }

}
