import java.util.Scanner;

public class Main {
    public static Scanner kb = new Scanner(System.in);
    public static String answer;
    public static boolean isGameOver = false;
    public static Node currentNode;
    public static Node[] nodes = new Node[44];

    public static void main(String[] args){


        nodes[0] = new Node(0, "start", "\nWELCOME TO DANIEL'S TINY ADVENTURE!\n\nYou are in a creepy house!  Where would you like to go? (kitchen, upstairs, patio, livingroom, basement)", -1, 0, false);

        nodes[1] = new Node(1, "kitchen", "\nYou are in the kitchen. Do you want to open the refrigerator or open the cabinet? (refrigerator, cabinet)", 0, 1, false);
        nodes[2] = new Node(2, "upstairs", "\nYou are upstairs. Where do you want to go now? (bedroom, bathroom)", 0, 1, false);
        nodes[3] = new Node(3, "patio", "\nYou are on the patio. Go to the pool or open the shed? (pool, shed)", 0, 1, false);
        nodes[4] = new Node(4, "livingroom", "\nDo you want to sit on the couch or turn on the TV? (couch, tv)", 0, 1, false);
        nodes[5] = new Node(5, "basement", "\nYou are at the basement. It's too dark to see anything. Keep walking on the dark or turn on the lights? (dark, lights)", 0, 1, false);

        nodes[6] = new Node(6, "refrigerator", "\nDo you prefer strange milk or leftovers? (milk, leftovers)", 1, 2, false);
        nodes[7] = new Node(7, "cabinet", "\nInside the cabinet there is a can of beans and a plate? (beans, plate)", 1, 2, false);
        nodes[8] = new Node(8, "bedroom", "\nDo you want to lay on the bed or open the drawer? (bed, drawer)", 2, 2, false);
        nodes[9] = new Node(9, "bathroom", "\nLook yourself in the mirror or use the toilet? (mirror, toilet)", 2, 2, false);
        nodes[10] = new Node(10, "pool", "\nDo you prefer to clean it or swim a little bit? (clean, swim)", 3, 2, false);
        nodes[11] = new Node(11, "shed", "\nYou are inside the shed. Do you want to take an ax or a hammer? (ax, hammer)", 3, 2, false);
        nodes[12] = new Node(12, "tv", "\nChange the channel or stay on the first channel? (change, stay)", 4, 2, false);
        nodes[13] = new Node(13, "couch", "\nDo you prefer to look at the window or eat something? (window, eat)", 4, 2, false);
        nodes[14] = new Node(14, "lights", "\nYou see a big angry dog. Do you turn the laundry on to scare him away or turn off the lights? (laundry, lights)", 5, 2, false);
        nodes[15] = new Node(15, "dark", "\nYou feel a chest and a closet in your way. Which one do you want to open? (chest, closet)", 5, 2, false);

        nodes[16] = new Node(16, "milk", "\nSpoiled milk. You died.", 6, 3, true);
        nodes[17] = new Node(17, "leftovers", "\nGood. You are not hungry anymore.", 6, 3, true);
        nodes[18] = new Node(18, "beans", "\nYou're full now.", 7, 3, true);
        nodes[19] = new Node(19, "plate", "\nThere's a big spider under the plate. It bites you and you die.", 7, 3, true);
        nodes[20] = new Node(20, "bed", "\nNice dreams!", 8, 3, true);
        nodes[21] = new Node(21, "drawer", "\nIt's a trap. Boom!.", 8, 3, true);
        nodes[22] = new Node(22, "mirror", "\nYou break the mirror!", 9, 3, true);
        nodes[23] = new Node(23, "toilet", "\nWhat a relief...", 9, 3, true);
        nodes[24] = new Node(24, "clean", "\nGood job.", 10, 3, true);
        nodes[25] = new Node(25, "swim", "\nA crocodile jumps on you. You died.", 10, 3, true);
        nodes[26] = new Node(26, "ax", "\nDo you chop a tree or throw the ax? (chop, throw)", 11, 3, false);
        nodes[27] = new Node(27, "hammer", "\nSo, hammer a nail or break the hammer? (nail, break)", 11, 3, false);
        nodes[28] = new Node(28, "change", "\nGreat! A soccer game! Increase or decrease the volume? (increase, decrease)", 12, 3, false);
        nodes[29] = new Node(29, "stay", "\nNothing but static. You heard something coming from the cabinet door. Open it or ignore it? (open, ignore)", 12, 3, false);
        nodes[30] = new Node(30, "window", "\nIt's so desert outside.", 13, 3, true);
        nodes[31] = new Node(31, "eat", "\nYou have nothing to eat.", 13, 3, true);
        nodes[32] = new Node(32, "laundry", "\nGood job. You scared the dog away", 14, 3, true);
        nodes[33] = new Node(33, "lights", "\nYou know dogs don't need lights to smell you, right? You die.", 14, 3, true);
        nodes[34] = new Node(34, "chest", "\nA poisonous snake jumps and bite you. You die.", 15, 3, true);
        nodes[35] = new Node(35, "closet", "\nIt's a trap. Boom!.", 15, 3, true);

        nodes[36] = new Node(36, "chop", "\nThe ax is too old and rusty to chop anything.", 26, 4, true);
        nodes[37] = new Node(37, "throw", "\nGood choice. You don't need that rusty ax", 26, 4, true);
        nodes[38] = new Node(38, "nail", "\nYou hammer your finger instead!!", 27, 4, true);
        nodes[39] = new Node(39, "break", "\nYou are not strong enough for that", 27, 4, true);
        nodes[40] = new Node(40, "increase", "\nThe TV explode. You die...", 28, 4, true);
        nodes[41] = new Node(41, "decrease", "\nYou heard strange noises comes from the door.", 28, 4, true);
        nodes[42] = new Node(42, "open", "\nYou save a little kitten. What a hero!!", 29, 4, true);
        nodes[43] = new Node(43, "ignore", "\nAre you too scared to go check it? Coward!", 29, 4, true);


        currentNode = nodes[0];

        while (!isGameOver) currentNode = checkAnswer(currentNode);

        System.out.println("\nGAME OVER\n\nThanks for playing!\n");
    }

        private static Node checkAnswer(Node currentNode){
            boolean isValidAnswer = false;

            System.out.println(currentNode.getMessage());
            if (currentNode.getIsLeaf()){
                isGameOver = true;
                return null;
            }

            while (!isValidAnswer){
                answer = kb.nextLine();

                for (int i = 0; i < nodes.length; i++) {
                    if (nodes[i].getFatherNode() == currentNode.getId()) {
                        if (answer.equals(nodes[i].getName()))
                            return nodes[i];
                    }
                }
            }
            return currentNode;
        }
}