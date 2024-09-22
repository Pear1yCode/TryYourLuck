public class Bear extends Bad {
    public void attack() {
        System.out.println(red + " 🐻 곰이 당신을 밀치고 도망갔습니다.");
        System.out.println(exit);
    }

    public void attack1() {
        System.out.println(red + " 🐻 곰이 발톱으로 당신을 할퀴고 도망갔습니다.");
        System.out.println(exit);
    }

    public void attack2() {
        System.out.println(red + " 🐻 곰이 당신을 물었지만 도망칠 수 있었습니다.");
        System.out.println(exit);
    }

    public void attack3() {
        System.out.println(red + "🐻 곰을 보고 도망가다가 넘어졌습니다.");
        System.out.println(exit);
    }

    public void attack4() {
        bear = 0;
        System.out.println(green + " 🐻 착한 곰을 만나 힐링했습니다. (목숨 +1)");
        System.out.println(exit);
    }

    public void attack5() {
        System.out.println(red + " 🐻 곰에게 치명적인 부상을 입었습니다. (목숨 -2)");
        heartBreak();
        System.out.println(exit);
    }
}
