
public class Main {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");
            if (x == 1) {
                System.out.print("d");
                x = x -1;
            }
            if (x == 2) {
                System.out.print("b c");
            }
        }
//        String[] privetOne;
//        privetOne = new String[3];
//        privetOne[0] = "sdsdsd";
//        privetOne[1] = "sdsdsd";
//        privetOne[2] = "sdsdddddddd";
//        String[] priwetTwo = {"Алло", "Привет", "Пока"};
//        String[] privetThree = {"Танцы", "Вино", "Похмелье"};
//
//        int oneLenght = privetOne.length;
//        int twoLenght = priwetTwo.length;
//        int threeLenght = privetThree.length;
//
//        int rand1 = (int) (Math.random() * oneLenght);
//        int rand2 = (int) (Math.random() * twoLenght);
//        int rand3 = (int) (Math.random() * threeLenght);
//
//        String fraza = privetOne[rand1] + priwetTwo[rand2] + privetThree[rand3];
//        System.out.println("Все что нам нужно - это " + fraza);
//    }
    }
}
//        int beerNum = 99;
//        String word = "бутылок (бутылки)";
//
//        while (beerNum > 0) {
//
//            if (beerNum == 1) {
//                word = "бутылка";
//            }
//            System.out.println(beerNum + " " + word + " пива на стене");
//            System.out.println(beerNum + " " + word + " пива.");
//            System.out.println("Возьми одну!");
//            System.out.println("Пусти по кругу!");
//            beerNum = beerNum - 1;
//        }
//
//
//            if (beerNum > 0) {
//                System.out.println(beerNum + " " + word + " пива на стене");
//            } else {
//                System.out.println("Нет бутылок пива на стене");
//            }
//
//        }

