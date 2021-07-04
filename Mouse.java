public class Mouse extends Mammal{


    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("SQUEEEAAAK!");

    }

    @Override
    protected void eat(Food food) {
        if(food.getClass().getName().equals("Vegetable")){
            this.setEatenFood(food.getQuantity());
        }else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
