import java.util.ArrayList;

public class Farm {
private int sizeOfProperty = 100;
ArrayList<Animal> insideBarn = new ArrayList();
ArrayList<Flower> plantedPlants = new ArrayList();

private ArrayList plantFlower(Flower f){
    plantedPlants.add(f);
    return plantedPlants;
}
private double waterPlant(Flower f){
    return f.chanceOfGrowth++;
}

private void barn(Animal a){
    if (insideBarn.size()<=20) {
        if (a.size.equals(Size.BIG) && insideBarn.size() <= 10) {
            insideBarn.add(a);
        } else if (a.size.equals(Size.SMALL) && insideBarn.size() <= 10) {
            insideBarn.add(a);
        }
    }
}







}
