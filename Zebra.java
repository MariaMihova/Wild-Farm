public class Zebra extends Mammal{


    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");
    }

    @Override
    protected void eat(Food food) {
        if(food.getClass().getName().equals("Vegetable")){
            this.setEatenFood(food.getQuantity());
        }else {
            System.out.printf("%ss are not eating that type of food!%n", this.getAnimalType());
        }
    }
}
