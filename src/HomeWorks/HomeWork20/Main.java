package HomeWorks.HomeWork20;

import java.util.Arrays;

public class Main {

    /*
    Создать класс грузовик Truck, содержащий общие характеристики грузовиков:
    model, manufacturer,year (год выпуска),colour,maxWeight (грузоподьемность),
    maxFuel (  обьем топливного бака), имя владельца
    и имеющий следующее поведение:
    1.должен уметь загружаться (load)  и при этом сообщать, если превышена его грузоподьемность а также сообщать
        сколько еще можно загрузить груза
    2.разгружаться и  при этом сообщать в случае если пытаются разгрузить больше чем имеющийся у него на борту груз
    или пытаются разгрузить отрицательный груз. Также должен сообщать вес остающегося на борту груза
    3. В случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
    4. Должен уметь ездить и останавливаться
    4. уметь заправляться топливом
    5. уметь сообщать имя владельца

    Создать несколько грузовиков, протестировать их работу , сложить в массив и вывести на экран
     */
    public static void main(String[] args) {
        Truck truck1 = new Truck("BMW","Germany", 2013,"blau", 6, 400,"Ben");
        Truck truck2 = new Truck("Reno", "France",2017, "white-red", 4, 600,"Itan");
        Truck truck3 = new Truck("Mecedes", "Germany", 2001,"yellow", 5,400,"Jack");
        Truck truck4 = new Truck("Man", "Germany",2020, "grau-red", 5, 500,"Genry");
        Truck truck5 = new Truck("Komatsu", "Japan",2009, "yellow",15, 800,"Bob");
        
        System.out.println(truck1);
        truck1.load(2);
        truck1.setCurrentFuel(300);
        truck1.move();
        truck1.stop();
        truck1.unload(1);

        Truck[] trucks = {truck1,truck2,truck3,truck4,truck5};

        for(Truck truck : trucks){
            System.out.println("Truck: " + truck.getModel() + ". " + truck.getOwner());
        }
        
        
     }
    
}
