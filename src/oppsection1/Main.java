package oppsection1;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11", 5, 8, 8);

        System.out.println(iPhone.getName());


        iPhone.playMusic("Our Wings are Buring");
        iPhone.playMusic("Lamenting Kiss");

        Phone pixel = new Phone("Pixel 3", 16);
    }
}
