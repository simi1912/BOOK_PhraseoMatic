public class PhraseOMatic {

    public static void main(String[] args) {

        String[] wordListOne = {"27/7", "multi-Tier", "30000 foot", "B-to-B", "win-win"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric"};
        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "portal"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        System.out.print(wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]);
    }
}
