public class BadItem extends Bad {
    public void item() {
        int randomItem = (int)(Math.random()*100)+1;
        System.out.println(red + " 🔴 나쁜 아이템을 발견했습니다.");
        if (randomItem <= 50) {
            rottenApple();
        } else if (randomItem <= 55) {
            unknownFruit();
        } else {
            rottenWater();
        }
        System.out.println(exit);
    }

    public void rottenApple() {
        bad = 1;
        System.out.println(red + "💔💔💔💔💔 썩은 사과를 먹었습니다. 💔💔💔💔💔");
        System.out.println("배탈이 나 건강이 악화됐습니다.");
        System.out.println(exit);
    }

    public void unknownFruit() {
        bad = 2;
        System.out.println(black + "🍇🍇🍇🍇🍇 처음보는 과일을 먹고 독에 걸렸습니다. 🍇🍇🍇🍇🍇");
        System.out.println("끔찍한 과일이었습니다.");
        System.out.println(exit);
    }

    public void rottenWater() {
        bad = 3;
        System.out.println(red + "💧💧💧💧💧 썩은 물을 마셨습니다. 💧💧💧💧💧");
        System.out.println("건강이 악화됐습니다.");
        System.out.println(exit);
    }

}
