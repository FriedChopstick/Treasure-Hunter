public class Treasure {

    private boolean ifFoundTreasure;

    public String getTreasure() {
        int x = (int) (Math.random() * 3) + 1;

        if (x == 1 && !ifFoundTreasure) {
            ifFoundTreasure = true;
            return "Viking Battle Axe";
        }
        else if (x == 2 && !) {
            ifFoundTreasure = true;
            return "Shieldmaiden Corset";
        }
        else if (x == 3) {
            ifFoundTreasure = true;
            return "Mjonir";
        }

    }

}
