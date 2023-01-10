//Часть 2. Задание 1.
public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", 2015, "России");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "чёрный", 2020, "Германии");
        Car bmv = new Car("BMW", "Z8", 3.0, "чёрный", 2021, "Германии");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корее");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корее");

        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmv.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }
}