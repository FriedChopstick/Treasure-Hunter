public class Treasure {

    private boolean foundTreasure;
    public static int totalTreasuresFound = 0;
    private static boolean isVBAFound = false;
    private static boolean isSCFound = false;
    private static boolean isMFound = false;

    public String getTreasure() {
        if(foundTreasure) {
            return "";
        }
        int x = (int) (Math.random() * 4) + 1;
        foundTreasure = true;
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
            return "";
        }
    }

}
