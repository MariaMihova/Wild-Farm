public class Tiger extends Felime{


    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion); //!!!!!!
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    protected void eat(Food food) {
        if(food.getClass().getName().equals("Meat")){
            this.setEatenFood(food.getQuantity());
        }else {
            System.out.printf("%ss are not eating that type of food!%n", this.getAnimalType());
        }
    }
}
