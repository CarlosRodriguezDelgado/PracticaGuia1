

public class Person {
    
    private String name;
    private int age;
    private PetManager manager;

    public Person(String name, int age, int numberOfPets) {
        this.name = name;
        this.age = age;
        this.manager = new PetManager(numberOfPets);
        }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean addPet(Pet pet){
        return manager.addPet(pet);
    }
    

}
