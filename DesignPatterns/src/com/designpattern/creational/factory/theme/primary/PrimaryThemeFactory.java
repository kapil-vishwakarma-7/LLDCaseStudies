package com.designpattern.creational.factory.theme.primary;

import com.designpattern.creational.factory.theme.Button;
import com.designpattern.creational.factory.theme.Menu;
import com.designpattern.creational.factory.theme.ThemeComponentFactory;
import com.designpattern.creational.factory.theme.dark.DarkButton;

public class PrimaryThemeFactory implements ThemeComponentFactory {

    @Override
    public Button createButton() {
        return new PrimaryButton();
    }

    @Override
    public Menu createMenu() {
        return new PrimaryMenu();
    }
}
