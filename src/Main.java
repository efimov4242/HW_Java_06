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
                getFilterMemory();
            } else if (menuNum == 2){
                getHdMemory();
            } else if (menuNum == 3){
                getOs();
            } else if (menuNum == 4){
                getColor();
            } else if (menuNum == 5){
                System.out.println("Ждем вас снова!");
                System.exit(0);
            }
            System.out.println();
            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            menuNum = iScanner.nextInt();
        }
    }

    public static void getColor() {
        System.out.println("Введите цвет ноутбука: ");
        Scanner scan = new Scanner(System.in);
        String nbColor = scan.nextLine();


        LinkedList<String> list = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if(notebook.getColor().equals(nbColor)) {
                list.add(notebook.getModel());
            }
        }
        System.out.printf("Ноутбуки цвет %s:\n", nbColor);
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void getOs() {
        System.out.println("Введите название ОС: ");
        Scanner scan = new Scanner(System.in);
        String osName = scan.nextLine();


        LinkedList<String> list = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if(notebook.getOs().equals(osName)) {
                list.add(notebook.getModel());
            }
        }
        System.out.printf("Ноутбуки с OC %s: \n", osName);
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void getHdMemory() {
        System.out.println("Введите минимальный объем жесткого диска: ");
        Scanner scan = new Scanner(System.in);
        int hdValue = scan.nextInt();

        LinkedList<String> list = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if(notebook.getHd() >= hdValue) {
                list.add(notebook.getModel());
            }
        }
        System.out.printf("Ноутбуки с объемом жесткого диска %dGb и более: ", hdValue);
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void getFilterMemory() {
        System.out.println("Введите минимальный объем оперативной памяти: ");
        Scanner scan = new Scanner(System.in);
        int memoryValue = scan.nextInt();

        LinkedList<String> list = new LinkedList<>();
        for (Notebook notebook : notebooks) {
            if(notebook.getMemory() >= memoryValue) {
                list.add(notebook.getModel());
            }
        }
        System.out.printf("Ноутбуки с объемом ОЗУ %dGb и более:",memoryValue);
        for (String item : list) {
            System.out.println(item);
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