import java.text.DecimalFormat;

public abstract class Mammal extends Animal{

    private String livingRegion;
    private int eatenFood;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
        this.eatenFood = 0;
    }

    public void setEatenFood(int eatenFood) {
        if(eatenFood >= 0) {
            this.eatenFood += eatenFood;
        }
    }

    public int getEatenFood() {
        return this.eatenFood;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    //{AnimalType} [{AnimalName}, {CatBreed}, {AnimalWeight}, {AnimalLivingRegion}, {FoodEaten}]

    @Override
    public String toString(){
        return String.format("%s[%s, %s, %s, %d]",
                this.getClass().getName(),this.getAnimalName(),
                new DecimalFormat("#.##").format(this.getAnimalWeight()),
        this.getLivingRegion(), this.getEatenFood());
    }
}
