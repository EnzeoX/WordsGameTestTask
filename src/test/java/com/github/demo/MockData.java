package com.github.demo;

public class MockData {

    public static String[] listOne = {"fish", "horse", "egg", "goose", "eagle"};

    public static String[] listTwo = {"fish", "horse", "snake", "goose", "eagle"};

    public static String[] listThree = {"fish", "horse", "", "goose", "eagle"};

    public static String[] listFour = {"", "horse", "", "goose", "eagle"};

    public static String[] expectedListOne = {"fish", "horse", "egg", "goose", "eagle"};

    public static String[] expectedListTwo = {"fish", "horse"};

    public static String[] expectedListThree = {"fish", "horse"};

    public static String[] expectedListFour = new String[]{};
}
