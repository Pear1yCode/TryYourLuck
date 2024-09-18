public class CoolItem extends Cool {
    public void item () {
        int randomItem = (int)(Math.random()*100)+1;
        System.out.println(blue + " 🔵 좋은 아이템을 발견했습니다.");
        if (randomItem <= 15) {
            goldApple();
        } else if (randomItem <= 30) {
            medicinalHerb();
        } else {
            fruit();
        }
        System.out.println(exit);
    }

    public void goldApple () {
        cool = 1;
        System.out.println(yellow + " 🟨🟨🟨🟨🟨 황금 사과를 발견했습니다. 🟨🟨🟨🟨🟨");
        System.out.println("황금 사과의 효과로 조금 더 빠른 여행을 할 수 있었습니다.");
        System.out.println(exit);
    }

    public void medicinalHerb () {
        cool = 2;
        System.out.println(green + "🌾🌿🍀🌱☘ 약초를 발견했습니다. 🌳🍃🍁🍂🌷");
        System.out.println("체력을 1 회복했습니다.");
    }

    public void fruit () {
        cool = 3;
        System.out.println(blue + " 🍉🍊🍒🍓🍎 과일을 발견했습니다. 🥝🍇🍑🍊🍋");
        System.out.println("맛있는 과일로 배를 채웠습니다.");
        System.out.println(exit);
    }
}
