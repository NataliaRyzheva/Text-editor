package ru.netology.graphics.image;

public class Color implements TextColorSchema {
    char[] chars = {'#', '$', '@', '%', '*', '+', '-', '.'};

    @Override
    public char convert(int color) {
        return  chars[(int) Math.floor(color / 256. * chars.length)];
    }
}
