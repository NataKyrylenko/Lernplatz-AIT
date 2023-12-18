package HomeWorks.HomeWork27;
/* создать магазин/фабрику по продаже и производству пиццы. Программа должна уметь готовить следующие виды пиццы:
    Гавайи, Маргарита, Салями.
    Каждый вид пиццы должен уметь: подготавливаться( накладывать ингридиенты напр), печься и упаковываться.
    В каждом случае должно быть понятно о какой пицце идет речь
    В классе OnlinePizzaShop  не должен создаваться новый обьект пицца, а из него должен поступать  "заказ" на изготовление
    требуемого вида пиццы (обьекта) в класс PizzaChoice, который и должен выбрать нужную пиццу для изготовления
    Выбор пиццы осуществляется клиентом с клавиатуры в классе OnlinePizzaShop, при этом нужно обеспечить проверку
    правильности выбора клиента и возможность заказать еще пиццу/пиццы
    1. Классы :
       Pizza - родительский класс
       PizzaSalami, PizzaMargarita, PizzaHawaii  -  дочерние
       В этих классах должны быть минимум три метода, отражающие процесс приготовления пиццы из ТЗ
       prepare()
       bake()
       pack()
       orderPizza()
       PizzaChoice -  сюда в соответствующий метод  будет передаваться выбор клиента и в зависимости от этого выбора
        через switch возвращаться новый обьект соответствующей пиццы
        Pizza createPizza( String type)

        Последовательность действий при заказе :
        Введите название пиццы ( 1,2,3)
        Preparing pizza with mozarella cheese
        Baking Pizza Margarita
        Packing Pizza margarita
         В методе main  через сканер предложить клиенту выбрать пиццу. Затем его выбор передать  передать
         в switch, находящийся в методе choosePizza
     */

import java.util.Scanner;

public class OnlinePizzaShop {
    public static void main(String[] args) {
        
    Scanner pizzaScanner = new Scanner(System.in);

    PizzaChoice choiceClass = new PizzaChoice();
        do{
            System.out.println("Hi, choose pizza: 1 - Salami, 2 - Margarita, 3 - Hawaii");
            String pizzaChoise =  pizzaScanner.nextLine();

            Pizza newPizza = choiceClass.choosePizza(pizzaChoise);
            while(newPizza ==null){
                System.out.println("You have made the wrong choise. Please chose pizza: 1 - Salami, 2 - Margarita, 3 - Hawaii");
                pizzaChoise = pizzaScanner.nextLine();
                newPizza = choiceClass.choosePizza(pizzaChoise);
            }

            newPizza.orderPizza();

            System.out.println("Do you want to order another pizza? enter no if no or any other key to order another pizza ");
        }while(!pizzaScanner.nextLine().equalsIgnoreCase("no"));
        System.out.println("Thank you for your order! We hope to see you soon");
}






    // String choice = pizzaScanner.nextLine();
    // if(choice.equals("1")){
    //     pizzaChoice.choosePizza("Salami");
    //     System.out.println("1");
    //     }
    // else if("2".equals(choice)){
    //     System.out.println("2");
    // }
    // else if("3".equals(choice)){
    //     System.out.println("3");
    // }
    // else{
    //     System.out.println("Invalid choice");
    // }

    // }
}

