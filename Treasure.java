public class Treasure {

    private boolean foundTreasure;
    public static int totalTreasuresFound = 0;
    private static boolean isVBAFound = false;
    private static boolean isSCFound = false;
    private static boolean isMFound = false;

    public Treasure() {
        foundTreasure = false;
    }

    public String getTreasure() {
        if(foundTreasure) {
            System.out.println("You already searched for a treasure in this town! ");
            return "";
        }
        int x = (int) (Math.random() * 4) + 1;
        foundTreasure = true;
        System.out.println();
        if (x == 1) {
            System.out.println("You found a Viking Battle Axe");
            if (isVBAFound) {
                System.out.println("You already own a Viking Battle Axe.");
                System.out.println("You discarded the Battle Axe.");
                return "";
            }
            totalTreasuresFound ++;
            isVBAFound = true;
            return "Viking Battle Axe";
        }
        else if (x == 2) {
            System.out.println("You found a Shieldmaiden Corset");
            if (isSCFound) {
                System.out.println("You already own a Shieldmaiden Corset");
                System.out.println("You discarded the Corset.");
                return "";
            }
            totalTreasuresFound ++;
            isSCFound = true;
            return "Shieldmaiden Corset";
        }
        else if (x == 3) {
            System.out.println("You found a Mjonir");
            if (isMFound) {
                System.out.println("You already own a Mjonir");
                System.out.println("You discarded the Mjonir.");
                return "";
            }
            totalTreasuresFound ++;
            isMFound = true;
            return "Mjonir";
        }
        else {
            System.out.println("You didn't find anything. ");
            return "";
        }
    }

    public int getTotalTreasuresFound() {
        return totalTreasuresFound;
    }

}
