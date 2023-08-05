import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        House house = new House("ULAN-2");
        Father father = new Father(48, "Bakyt", "Mazda RX-7", Habits.HARDWORKING, house, "Marketolog");

        System.out.println(father.getInfo());
        father.makeVoice();
        father.makeVoice("Goodbye World");

        System.out.println();

        House house1 = new House("TIME SQUARE");
        Son son1 = new Son(25, "Arsen", "KIA K5", Habits.SLEEPY, house1,"INTERN IN LAB", "HARVARD");
        System.out.println(son1.getInfo());
        son1.makeVoice();
        son1.makeVoice("I study well");

        System.out.println();

        Son son2 = new Son(29, "Bekzat", "FORD MUSTANG", Habits.DECISIVE, house1, "STARBUKS", "OXFORD");
        System.out.println(son2.getInfo());
        son1.makeVoice();
        son1.makeVoice("I am very smart");

        System.out.println();
    }
}





