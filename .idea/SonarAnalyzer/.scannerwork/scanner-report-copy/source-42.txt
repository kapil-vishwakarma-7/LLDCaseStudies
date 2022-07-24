package com.designpattern.creational.factory.theme;

import com.designpattern.creational.factory.theme.dark.DarkTheme;

public class Client {
    private Theme theme;

    public Client(Theme theme){
        this.theme = theme;
    }

    public void client () {
        ThemeComponentFactory componentFactory = theme.createThemeComponentFactory();
        Button button = componentFactory.createButton();
        Menu menu = componentFactory.createMenu();
    }
}

