package BreakStatement;

public class BreakStatement {

    public static void main(String[] args) {

//        mylabel:
//        int[] myArray = {1,2,3,4};

        myLabel:
        {
        int[] myArray = {1,2,3};
        }


        String[] animals = {"Dog", "Cat", "Lizard", "Bird"};
        for (String animal : animals) {
            System.out.println(animal);
        }



        MY_LOOP: for(String animal: animals) {
            if (animal.equals("Cat")) {
                break MY_LOOP;
            }
            System.out.println(animal);
        }


        animal: for (String animal: animals) {
            if (animal.equals("Cat")) {
                break animal;

            }
            System.out.println(animal);
        }

        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];

            if (animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
            index++;
        }
    }
}
