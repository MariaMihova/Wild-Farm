import java.text.DecimalFormat;

public class Cat extends Felime {

    private String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    protected void eat(Food food) {
        this.setEatenFood(food.getQuantity());

    }

    @Override
    public String toString(){
        return String.format("%s[%s, %s, %s, %s, %d]",
                this.getClass().getName(),this.getAnimalName(), this.getBreed(),
                new DecimalFormat("#.##").format(this.getAnimalWeight()),
                this.getLivingRegion(), this.getEatenFood());
    }
}
