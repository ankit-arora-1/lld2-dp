package factory;

import factory.button.Button;
import factory.button.IOSButton;
import factory.dropdown.Dropdown;
import factory.dropdown.IOSDropdown;
import factory.menu.IOSMenu;
import factory.menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createDropdown() {
        return new IOSDropdown();
    }
}
