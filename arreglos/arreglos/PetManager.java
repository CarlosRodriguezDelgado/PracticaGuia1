
public class PetManager {

    private int counter;
    private Pet[] pets;

    public PetManager(int numberOfPets) {
        this.pets = new Pet[numberOfPets];
    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                counter++;
                return true;
            }
        }
        return false;
    }

    public boolean removePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[pets.length - 1] = null;
                counter--;
                return true;
            }
        }
        return false;
    }

    public Pet[] getPets() {
        Pet[] pets = new Pet[this.counter];

        for (int i = 0; i < pets.length; i++) {
            pets[i] = this.pets[i];
        }
        return pets;
    }

    public boolean updatePets(Pet pet, int index) {

        if (index >= pets.length ) {
            for(int i = 0; i < pets.length; i++) {
                 if (pets[i] != null) {
                    pets[index] = pet;
                    return true;
                 }
            }
        }else{
            IOManager.printMessage("Index past the total counter");
        }
        return false;

    }
}
