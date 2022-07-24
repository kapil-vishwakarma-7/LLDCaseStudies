package com.designpattern.creational.factory.theme.primary;

import com.designpattern.creational.factory.theme.Theme;
import com.designpattern.creational.factory.theme.ThemeComponentFactory;

public class PrimaryTheme extends Theme {
    @Override
    public ThemeComponentFactory createThemeComponentFactory() {
        return new PrimaryThemeFactory();
    }
}
