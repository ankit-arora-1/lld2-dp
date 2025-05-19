package factory;

import factory.button.Button;
import factory.dropdown.Dropdown;
import factory.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.IOS);

        UIFactory uiFactory = flutter.createFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
    }
}
