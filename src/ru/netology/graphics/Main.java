package ru.netology.graphics;


import ru.netology.graphics.image.Converter;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.server.GServer;


public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter(); // Создайте тут объект вашего класса конвертера
        // String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        //  TextGraphicsConverter converter = new URL(); // Создайте тут объект вашего класса конвертера
        //  converter.setMaxRatio(2);  // выставляет максимально допустимое соотрношение сторон картинки
        //  String imgTxt = converter.convert(url); // для слишком широкой картинки должно выброситься исключение BadImageSizeException.


        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}
