
public class Main {

    public static void main(String[] args) {
        /*  int[] numbers = {10, 20, 30, 40, 50};

        String[] fruits = new String[3];

        System.out.println(numbers[1]);
        System.out.println(fruits[1]);
        
         */
        Person person = new Person("Pepe", 30, 2);
        Pet pet1 = new Pet("Goldie", "Fish");
        /*  for (Pet pet : person.getPet()) {
              System.out.println(pet.getPetName());
         }*/

        if (person.addPet(pet1)) {
            IOManager.printMessage("Pet added succesfully");
        } else {
            IOManager.printMessage("Failed to add pet");
        }
        for (Pet pet : person.getPetManager().getPets()) {
            IOManager.printMessage(pet.getPetName());
        }

        if (person.getPets().length == 0) {
            IOManager.printMessage("No pets found");
        } else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        if (person.removePet(pet1)) {
            IOManager.printMessage("Pet removed successfully");
        } else {
            IOManager.printMessage("Failed to remove pet");
        }

        if (person.updatePets(pet1, 2)) {
            IOManager.printMessage("Pet updated succesfully");
        } else {
            IOManager.printMessage("Failed to update pet");
        }
    }
}
