/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
*/
public class Notebook {
    private String model;
    private int memory;
    private int hd;
    private String os;
    private String color;

    public Notebook(String model, int memory, int hd, String os, String color) {
        this.model = model;
        this.memory = memory;
        this.hd = hd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public int getHd() {
        return hd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return model + " " + memory + " " + hd + " " + os + " " + color;
    }

}
