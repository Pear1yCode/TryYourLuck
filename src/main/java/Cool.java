public class Cool extends Event {
    @Override
    public void coolEvent() {
        super.coolEvent();
        int randomCool = (int)(Math.random()*10);
        if (randomCool <= 2) {
            nothing();
        } else if (randomCool <= 4) {
            hide();
        } else if (randomCool <= 6) {
            item();
        } else if (randomCool <= 8) {
            village();
        } else {
            System.out.println(blue + " 😚 알찬 모험을 마치고 하루를 보냈습니다.");
            System.out.println(exit);
        }
    }

    public void nothing() {
        System.out.println(blue + "😅 아무 일도 없었습니다.");
        System.out.println(exit);
    }

    public void hide() {
        System.out.println(blue + " 🐻 곰을 만났지만 다행히 피할 수 있었습니다.");
        System.out.println(exit);
    }

    public void item() {
        Cool ci = new CoolItem();
        System.out.println(blue + " 🎁 아이템을 발견했습니다.");
        ci.item();
        System.out.println(exit);
    }

    public void village() {
        System.out.println(blue + " 🏘 마을을 발견해 하루를 안전하게 푹 쉴 수 있었습니다.");
        System.out.println(exit);
    }
}
