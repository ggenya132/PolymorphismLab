import java.util.Scanner;

/**
 * Created by eugenevendensky on 1/31/17.
 */
public class InputOutput {
    Scanner scanner = new Scanner(System.in);
    PetFactory petFactory = new PetFactory();

    public boolean askIfMorePets() {
        boolean hasPets = false;
        System.out.println("Do you have any more pets? 'Yes' or 'No' ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Yes")) {
            hasPets = true;
        } else if (answer.equalsIgnoreCase("No")) {
            hasPets = false;
        }
        return hasPets;
    }

    public void coreLoop() {
        boolean looping = true;
        while(looping){
        String petName = "";
        System.out.println("How many pets do you have?");
        int amountOfPets = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < amountOfPets; i++) {
            System.out.println("What kind of pet do you have?");
            String petType = scanner.nextLine();
            petFactory.makePet(petType, i);
            System.out.println("What is the pet's name?");
            petName = scanner.nextLine();

            petFactory.petCollection.pets.get(i).setPetName(petName);

        }

            looping = askIfMorePets();
        }
        printAllPets();
        }

    public void printAllPets(){
        for(int i = petFactory.petCollection.pets.size() - 1; i >= 0; i--){
            System.out.println(petFactory.petCollection.pets.get(i).getName() + " goes ");
            petFactory.petCollection.pets.get(i).speak();
        }
    }
    }


