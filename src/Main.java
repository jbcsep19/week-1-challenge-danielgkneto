import java.util.Scanner;

public class Main {
    public static Scanner kb = new Scanner(System.in);
    public static String answer;

    public static void main(String[] args){

        System.out.println("\nWELCOME TO DANIEL'S TINY ADVENTURE!\n");

        System.out.println("\nYou are in a creepy house!  Where would you like to go? (kitchen, upstairs, patio, livingroom, basement)");

        answer = kb.nextLine();

        switch (answer) {
            case "kitchen": {
                kitchen();
                break;
            }
            case "upstairs": {
                upstairs();
                break;
            }
            case "patio": {
                patio();
                break;
            }
            case "livingroom": {
                livingRoom();
                break;
            }
            case "basement": {
                basement();
                break;
            }
            default:
                System.out.println("\nWrong answer. You died!");
                break;
        }
    }

    private static void kitchen() {

        System.out.println("\nYou are in the kitchen. Do you want to open the refrigerator or open the cabinet? (refrigerator, cabinet)");

            answer = kb.nextLine();

            if (answer.equals("refrigerator")) {
                System.out.println("\nDo you prefer strange milk or leftovers? (milk, leftovers)");
                answer = kb.nextLine();

                if (answer.equals("milk")) System.out.println("\nSpoiled milk. You died.");
                else if (answer.equals("leftovers")) System.out.println("\nGood. You are not hungry anymore.");
                else System.out.println("\nWrong answer. You died");
            }
            else if (answer.equals("cabinet")) {
                System.out.println("\nInside the cabinet there is a can of beans and a plate? (beans, plate)");
                answer = kb.nextLine();

                if (answer.equals("beans")) System.out.println("\nYou're full now.");
                else if (answer.equals("plate")) System.out.println("\nThere's a big spider under the plate. It bites you and you die.");
                else System.out.println("\nWrong answer. You died");
            }
            else System.out.println("\nWrong answer. You died");
    }

    private static void upstairs() {
        System.out.println("\nYou are upstairs. Where do you want to go now? (bedroom, bathroom)");

        answer = kb.nextLine();

        if (answer.equals("bedroom")) {
            System.out.println("\nDo you want to lay on the bed or open the drawer? (bed, drawer)");
            answer = kb.nextLine();

            if (answer.equals("bed")) System.out.println("\nNice dreams!");
            else if (answer.equals("drawer")) System.out.println("\nIt's a trap. Boom!.");
            else System.out.println("\nWrong answer. You died");
        }
        else if (answer.equals("bathroom")) {
            System.out.println("\nLook yourself in the mirror or use the toilet? (mirror, toilet)");
            answer = kb.nextLine();

            if (answer.equals("mirror")) System.out.println("\nYou break the mirror!");
            else if (answer.equals("toilet")) System.out.println("\nWhat a relief...");
            else System.out.println("\nWrong answer. You died");
        }
        else System.out.println("\nWrong answer. You died");
    }

    private static void patio() {
        System.out.println("\nYou are on the patio. Go to the pool or open the shed? (pool, shed)");

        answer = kb.nextLine();

        if (answer.equals("pool")) {
            System.out.println("\nDo you prefer to clean it or swim a little bit? (clean, swim)");
            answer = kb.nextLine();

            if (answer.equals("clean")) System.out.println("\nGood job.");
            else if (answer.equals("swim")) System.out.println("\nA crocodile jumps on you. You died.");
            else System.out.println("\nWrong answer. You died");
        }
        else if (answer.equals("shed")) {
            System.out.println("\nYou are inside the shed. Do you want to take an ax or a hammer? (ax, hammer)");
            answer = kb.nextLine();

            if (answer.equals("ax")) {
                System.out.println("\nDo you chop a tree or throw the ax? (chop, throw)");
                answer = kb.nextLine();

                if (answer.equals("chop")) System.out.println("\nThe ax is too old and rusty to chop anything.");
                else if (answer.equals("throw")) System.out.println("\nGood choice. You don't need that rusty ax");
                else System.out.println("\nWrong answer. You died");
            }
            else if (answer.equals("hammer")) {
                System.out.println("\nSo, hammer a nail or break the hammer? (nail, break)");
                answer = kb.nextLine();

                if (answer.equals("nail")) System.out.println("\nYou hammer your finger instead!!");
                else if (answer.equals("break")) System.out.println("\nYou are not strong enough for that");
                else System.out.println("\nWrong answer. You died");
            }
            else System.out.println("\nWrong answer. You died");
        }
        else System.out.println("\nWrong answer. You died");
    }

    private static void livingRoom() {
        System.out.println("\nDo you want to sit on the couch or turn on the TV? (couch, tv)");

        answer = kb.nextLine();

        if (answer.equals("couch")) {
            System.out.println("\nDo you prefer to look at the window or eat something? (window, eat)");
            answer = kb.nextLine();

            if (answer.equals("window")) System.out.println("\nIt's so desert outside.");
            else if (answer.equals("eat")) System.out.println("\nYou have nothing to eat.");
            else System.out.println("\nWrong answer. You died");
        }
        else if (answer.equals("tv")) {
            System.out.println("\nChange the channel or stay on the first channel? (change, stay)");
            answer = kb.nextLine();

            if (answer.equals("change")) {
                System.out.println("\nGreat! A soccer game! Increase or decrease the volume? (increase, decrease)");
                answer = kb.nextLine();

                if (answer.equals("increase")) System.out.println("\nThe TV explode. You die...");
                else if (answer.equals("decrease")) System.out.println("\nYou heard strange noises comes from the door.");
                else System.out.println("\nWrong answer. You died");
            }
            else if (answer.equals("stay")) {
                System.out.println("\nNothing but static. You heard something coming from the cabinet door. Open it or ignore it? (open, ignore)");
                answer = kb.nextLine();

                if (answer.equals("open")) System.out.println("\nYou save a little kitten. What a hero!!");
                else if (answer.equals("ignore")) System.out.println("\nYou are too scared to go check it. Coward!");
                else System.out.println("\nWrong answer. You died");
            }
            else System.out.println("\nWrong answer. You died");
        }
        else System.out.println("\nWrong answer. You died");
    }

    private static void basement() {
        System.out.println("\nYou are at the basement. It's too dark to see anything. Keep walking on the dark or turn on the lights? (dark, lights)");

        answer = kb.nextLine();

        if (answer.equals("dark")) {
            System.out.println("\nYou feel a chest and a closet in your way. Which one do you want to open? (chest, closet)");
            answer = kb.nextLine();

            if (answer.equals("chest")) System.out.println("\nA poisonous snake jumps and bite you. You die.");
            else if (answer.equals("closet")) System.out.println("\nIt's a trap. Boom!.");
            else System.out.println("\nWrong answer. You died");
        }
        else if (answer.equals("lights")) {
            System.out.println("\nYou see a big angry dog. Do you turn the laundry on to scare him away or turn off the lights? (laundry, lights)");
            answer = kb.nextLine();

            if (answer.equals("laundry")) System.out.println("\nGood job. You scared the dog away");
            else if (answer.equals("lights")) System.out.println("\nYou know dogs don't need lights to smell you, right? You die.");
            else System.out.println("\nWrong answer. You died");
        }
        else System.out.println("\nWrong answer. You died");
    }
}