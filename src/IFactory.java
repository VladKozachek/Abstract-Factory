public interface IFactory {
    IDisplay display(String typeDisplay);
    ITelephone phone(String typePhone);
}
