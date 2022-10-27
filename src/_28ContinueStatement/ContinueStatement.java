package PACKAGE_NAME._28ContinueStatement;


public class ContinueStatement {

    public static void main(String[] args) {

        String[] animals = {"Dog", "Cat", "Lizard", "Snake"};

        LABEL: for (String animal : animals ) {
            LABEL2: if (animal.equals("Cat")) {
                continue;
            }
            System.out.println(animal);

        }

    }
}
