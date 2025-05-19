package factory;

import factory.button.AndroidButton;
import factory.button.Button;
import factory.dropdown.AndroidDropdown;
import factory.dropdown.Dropdown;
import factory.menu.AndroidMenu;
import factory.menu.Menu;

public class AndroidUIFactory implements UIFactory {

    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
