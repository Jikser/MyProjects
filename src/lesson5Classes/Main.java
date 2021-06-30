package lesson5Classes;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //4. Создать массив из 5 сотрудников.
        Coworker[] arrayCoworkers = new Coworker[5];// Вначале объявляем массив объектов   // потом для каждой ячейки массива задаем объект
        arrayCoworkers[0] = new Coworker("Anderson", "Tomas", "A.", "programmer", "whiterabbit@haker.ru", 1421242, 600, 28);
        arrayCoworkers[1] = new Coworker("Grey", "Gandalf", "Mitrandirovich", "mage", "GrayTraveller@valinor.me", 1421243, 100, 521);
        arrayCoworkers[2] = new Coworker("Turtle", "Donatello", "Splintorovich", "ninja", "LikeAbro@pizza.time", 1421244, 0, 22);
        arrayCoworkers[3] = new Coworker("Skywalker", "Anakin", "Obivanovich", "jedi", "PadmeN1@tatuin.bh", 1421245, 3000, 22);
        arrayCoworkers[4] = new Coworker("Marsh", "Randy", "Marvinovich", "geologist & farmer", "TegridyFarms@s-p.fan", 1421246, 300000, 43);
        //arrayCoworkers[1].info();
        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < arrayCoworkers.length; i++) {
            if (arrayCoworkers[i].getAge() > 40) {
                arrayCoworkers[i].info();
                System.out.println();
            }

        }
    }
}


//Пример:
//Person[] persArray = new Person[5];
//persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
//persArray[1] = new Person(...);
//...
//persArray[4] = new Person(...);
//



