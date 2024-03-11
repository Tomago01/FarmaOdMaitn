import java.util.ArrayList;

public class Farm {
private int sizeOfProperty = 100;
ArrayList<Flower> plantedPlants = new ArrayList();

private ArrayList plantFlower(Flower f){
    plantedPlants.add(f);
    return plantedPlants;
}
private double waterPlant(Flower f){
    return f.chanceOfGrowth++;
}





}
