package com.designpattern.creational.factory.theme.dark;

import com.designpattern.creational.factory.theme.Button;
import com.designpattern.creational.factory.theme.Menu;
import com.designpattern.creational.factory.theme.ThemeComponentFactory;

public class DarkThemeFacotry implements ThemeComponentFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Menu createMenu() {
        return new DarkMenu();
    }
}
