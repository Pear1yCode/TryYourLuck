public class Bad extends Event {

    @Override
    public void badEvent () {
        super.badEvent();
        int randomBad = (int)(Math.random()*100)+1;
        if (randomBad <= 30) {
            hurt();
        } else if (randomBad <= 60) {
            bear();
        } else if (randomBad <= 90) {
            item();
        } else if (randomBad < 92) {
            fall();
        } else {
            System.out.println(red + " 🐝🐝🐝🐝🐝 벌집을 건드렸습니다. 🐝🐝🐝🐝🐝");
            System.out.println(exit);
        }
    }

    public void hurt () {
        System.out.println(red + " 😣 길을 가다가 넘어져 다쳤습니다.");
        System.out.println(exit);
    }

    public void bear () {
        Bear bear = new Bear();
        int randomBearAttack = (int)(Math.random()*10);
        if (randomBearAttack <= 1) {
            bear.attack();
        } else if (randomBearAttack <= 3) {
            bear.attack1();
        } else if (randomBearAttack <= 5) {
            bear.attack2();
        } else if (randomBearAttack <= 7) {
            bear.attack3();
        } else if (randomBearAttack <= 9) {
            bear.attack4();
        } else {
            bear.attack5();
        }
    }

    public void item () {
        Bad bi = new BadItem();
        System.out.println(" 🎁 아이템을 발견했습니다.");
        bi.item();
        System.out.println(exit);
    }

    public void fall () {
        System.out.println(red + " 💥 모험가가 발을 헛딛여 낭떠러지에서 떨어졌습니다.");
        over();
        System.out.println(exit);
    }
}
