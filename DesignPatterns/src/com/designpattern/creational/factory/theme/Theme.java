package com.designpattern.creational.factory.theme;

public abstract class Theme {
    private String name;
    private String primaryColor;
    private String authorName;

    public  abstract ThemeComponentFactory createThemeComponentFactory();
}
