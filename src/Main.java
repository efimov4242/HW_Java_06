import jdk.jfr.SettingControl;

import java.util.*;

public class Main {
    static ArrayList<Notebook> notebooks = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин ноутбуков: ");
        printMenu();
        initData();

        Scanner iScanner = new Scanner(System.in);
        int menuNum = iScanner.nextInt();

        while (true) {
            if(menuNum == 1){
                getNotebookModel();
            } else if (menuNum == 2){

            } else if (menuNum == 3){

            } else if (menuNum == 4){

            } else if (menuNum == 5){
                System.out.println("Ждем вас снова!");
                System.exit(0);
            }
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            menuNum = iScanner.nextInt();
        }
    }

    public static void getNotebookModel() {
        System.out.println("Введите минимальный объем оперативной памяти: ");
        Scanner scan = new Scanner(System.in);
        int memoryValue = scan.nextInt();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Notebook curer = null;
            if(curer.getMemory() >= memoryValue) {
                list.add(curer.getModel());
        }
//        for (Notebook notebook : notebooks) {
//            if(notebook.getMemory() >= memoryValue) {
//                list.add(notebook.getModel());
//            }
            System.out.println(list);

        }
        }

    public static void initData() {
        notebooks.add(new Notebook("1", 8, 256, "Windows", "Black"));
        notebooks.add(new Notebook("2", 12, 256, "Linux", "Grey"));
        notebooks.add(new Notebook("3", 16, 512, "macOS", "Grey"));
        notebooks.add(new Notebook("4", 32, 1, "no OS", "White"));
        notebooks.add(new Notebook("5", 16, 512, "Windows", "Red"));
        notebooks.add(new Notebook("6", 4, 256, "Linux", "White"));
        notebooks.add(new Notebook("7", 8, 256, "macOS", "Grey"));
        notebooks.add(new Notebook("8", 32, 512, "Linux", "Black"));
        notebooks.add(new Notebook("9", 64, 512, "Windows", "Grey"));
    }

    static void printMenu() {
            Map<Integer, String> menu = new HashMap<>();
            menu.put(1, "ОЗУ");
            menu.put(2, "Объем ЖД");
            menu.put(3, "Операционная система");
            menu.put(4, "Цвет");
            menu.put(5, "Выход");
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            for (Map.Entry entry : menu.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
    }
}