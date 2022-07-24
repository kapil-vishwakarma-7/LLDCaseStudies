package com.designpattern.creational.factory.theme.dark;

import com.designpattern.creational.factory.theme.Theme;
import com.designpattern.creational.factory.theme.ThemeComponentFactory;

public class DarkTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new DarkThemeFacotry();
    }
}
