public class Main {

    public static void main(String[] args) {
      /*  int[] numbers = {10, 20, 30, 40, 50};

        String[] fruits = new String[3];

        System.out.println(numbers[1]);
        System.out.println(fruits[1]);
        
                */

        
        Person person = new Person("Pepe", 30, 3);
        
        for (Pet pet : person.getPet()) {
            System.out.println(pet.getPetName());
        }     

    }


}