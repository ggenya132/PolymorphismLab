
public class PetFactory {

    PetCollection petCollection = new PetCollection();

    public void makePet(String petInput, int element) {
        Pet pet;
        switch (petInput.toLowerCase()) {

            case "cat":
                pet = new Cat();
                    petCollection.pets.add(element, pet);
                break;
            case "dog":
                pet = new Dog();
                petCollection.pets.add(element, pet);
                break;
            case "bird":
                pet = new Bird();

                    petCollection.pets.add(element, pet);
                break;
        }
    }
}


