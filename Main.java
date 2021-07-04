import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animalInfo = scanner.nextLine().split("\\s+");

        List<Mammal> mammals = new ArrayList<>();

        while (!animalInfo[0].equals("End")){
            String[] foodInfo = scanner.nextLine().split("\\s+");
            Food food = checkFood(foodInfo);
            String type = animalInfo[0];
            String name = animalInfo[1];
            double weight = Double.parseDouble(animalInfo[2]);
            String region = animalInfo[3];
            switch (type){
                //{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} [{CatBreed} = Only if its cat]
                case "Mouse":
                    Mouse mouse = new Mouse(name, type, weight, region);
                    mouse.makeSound();
                    mouse.eat(food);
                    mammals.add(mouse);
                    break;
                case "Zebra":
                    Zebra zebra = new Zebra(name, type, weight, region);
                    zebra.makeSound();
                    zebra.eat(food);
                    mammals.add(zebra);
                    break;
                case "Cat":
                    String breed = animalInfo[4];
                    Cat cat = new Cat(name, type, weight, region, breed);
                    cat.makeSound();
                    cat.eat(food);
                    mammals.add(cat);
                    break;
                case "Tiger":
                    Tiger tiger = new Tiger(name, type, weight, region);
                    tiger.makeSound();
                    tiger.eat(food);
                    mammals.add(tiger);
                    break;
            }
            animalInfo = scanner.nextLine().split("\\s+");
        }

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());

        }
    }

    private static Food checkFood(String[] foodInfo) {
        if(foodInfo[0].equals("Vegetable")){
            return new Vegetable(Integer.parseInt(foodInfo[1]));
        }
        return new Meat(Integer.parseInt(foodInfo[1]));
    }

}
