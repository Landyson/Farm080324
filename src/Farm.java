import java.util.ArrayList;

public class Farm {

    public int animalWeight;

    public
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Flower> flowers = new ArrayList<>();

    public void addAnimals(Animal animal) throws Exception{
        if (animals.size() <= 20){
            animals.add(animal);
        }else {
            throw new Exception("You cant have more than 20 animals.");
        }

    }

    public void removeAnimal(int index) throws Exception{
        if (index < 0){
            throw new Exception();
        }else {
            animals.remove(index);
        }
    }

    public void addFlowers(Flower flower){
        flowers.add(flower);
    }

    public void removeFlover(int index) throws Exception{
        if (index < 0){
            throw new Exception();
        }else {
            flowers.remove(index);
        }
    }

    public void maxFlowers() throws Exception{
        if (flowers.size() > 5) {
            new Exception("You cant grow more than 5 flowers at same time");
        } else {
            return;
        }
    }




}
