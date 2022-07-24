package com.designpattern.creational.factory.theme;

import com.designpattern.creational.factory.theme.dark.DarkButton;

public interface ThemeComponentFactory {
    Button createButton();
    Menu createMenu();
}
