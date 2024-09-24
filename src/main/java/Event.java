import java.util.Scanner;

public class Event {
    // 지역이 아닌 전역에서 사용할 수 있도록 static을 사용했다. => static을 사용하지 않으면 계속 0으로 초기화되어 information을 제대로 이용 할 수 없다.
    private static int time; // 모험을 할 수 있는 횟수
    private static int dead; // 목숨
    private static int allTime;
    private static int heart;
    private static int difficulty;

    protected int bear;
    protected int cool;
    protected int bad;

    Scanner sc = new Scanner(System.in);

/*글자와 배경색 넣기에 대한 부분은 파이썬과 어느정도 비슷하다.

파이썬은 class Colors에 끝에 black = 색상코드 식으로 만드는 것으로 보인다.*/
    
    // 글자에 색 넣기용
    public static final String black = "\u001B[30m"; // 검은색
    public static final String green = "\u001B[32m"; // 초록색
    public static final String blue = "\u001B[34m"; // 파란색  넣기 위해 넣음 // static으로 어디서든 사용할 수 있고 final로 변하지 않음
    public static final String red = "\u001B[31m"; // 빨간색 넣기 위해 넣음 // static으로 어디서든 사용할 수 있고 final로 변하지 않음
    public static final String yellow = "\u001B[33m"; // 노란색
    public static final String purple = "\u001B[35m"; // 보라색
    public static final String aqua = "\u001B[36m"; // 아쿠아
    public static final String white = "\u001B[37m"; // 하얀색 // 딱히 사용할 일은 없다. console 배경을 검은색으로 만들 수 있다면 좋은 선택지가 될 것으로 보임
    public static final String exit = "\u001B[0m"; // 종료 코드가 없으면 색이 계속 적용되므로 문제생기면 사용

    // 콘솔 배경에 색 넣기용
    public static final String BACK_BLACK = "\u001B[40m";
    public static final String BACK_RED = "\u001B[41m";
    public static final String BACK_GREEN = "\u001B[42m";
    public static final String BACK_YELLOW = "\u001B[43m";
    public static final String BACK_BLUE = "\u001B[44m";
    public static final String BACK_PURPLE = "\u001B[45m";
    public static final String BACK_CYAN = "\u001B[46m";
    public static final String BACK_WHITE = "\u001B[47m";


    public void game() {
        System.out.println(BACK_BLACK + yellow + "■■■■■■■■■■■  ■■■■■■■■■    ■■      ■■ " + aqua + "     ■■      ■■    ■■■■    ■■       ■■  ■■■■■■■■■   " + green + "     ■■■          ■■       ■■      ■■■■■■■   ■■■     ■■ ");
        System.out.println(yellow + "■■■■■■■■■■■  ■■       ■■   ■■    ■■  " + aqua + "      ■■    ■■   ■■    ■■  ■■       ■■  ■■       ■■ " + green + "     ■■■          ■■       ■■    ■■          ■■■  ■■    ");
        System.out.println(yellow + "    ■■■      ■■■■■■■■■       ■■■■    " + aqua + "        ■■■■     ■■    ■■  ■■       ■■  ■■■■■■■■■   " + green + "     ■■■          ■■       ■■   ■■           ■■■■■      ");
        System.out.println(yellow + "    ■■■      ■■■      ■■      ■■     " + aqua + "         ■■      ■■    ■■   ■■     ■■   ■■■      ■■ " + green + "     ■■■■■■■■■■    ■■     ■■     ■■          ■■■  ■■    ");
        System.out.println(yellow + "    ■■■      ■■■      ■■      ■■     " + aqua + "         ■■        ■■■■       ■■■■■     ■■■      ■■ " + green + "     ■■■■■■■■■■      ■■■■■         ■■■■■■■   ■■■     ■■ ");
        colorExit();
        System.out.println(purple + "당신의 운을 시험해보세요.");
        colorExit();
        System.out.println();
        System.out.println(blue + "1. 게임 시작");
        System.out.println(red + "2. 게임 종료");
        colorExit();
        String game = sc.nextLine();
        String game1 = game.replace(" ", "");
        if (game1.equals("1") || game1.equals("1.") || game1.equals("게임 시작") || game1.equals("1 게임 시작") || game1.equals("1. 게임 시작")
                || game1.contains("게임시작") || game1.contains("시작")) {
            System.out.println(green + "게임을 시작합니다.");
            colorExit();
            start();
            Adventurer ad = new Adventurer();
            menu();
        } else if (game1.equals("2") || game1.equals("2.") || game1.equals("게임 종료") || game1.equals("1 게임 종료") || game1.equals("1. 게임 종료")
                || game1.contains("게임종료") || game1.contains("종료")) {
            end();
        } else {
            System.out.println("올바른 명령어를 입력해주세요 😚");
        }
    }
/* 이게 더 자유롭게 색을 넣을 수 있을 것 같은데 잘 모르겠다.
매개변수를 뭘 넣어야하지?
            public void backgroundColor () {
            JPanel panel = new JPanel();
            panel.setBackground(Color.GREEN);

            JFrame frame = new JFrame("배경색");
            frame.setSize(100,100);
            frame.add(panel);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    */ 

    public void gameInfo () {
        System.out.println("특별한 내용이 없다면 좋은 이벤트는 패널티 없이 모험횟수가 줄어들고, 나쁜 이벤트는 목숨이 1 줄어듭니다.");
    }
    
    public void run() {
        int runner = (int)(Math.random()*1001)+1;
        for(int i=0; i <= 10; i++) {
            try {
                Thread.sleep(runner);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (runner <= 200) {
                System.out.print("🏃🏻‍♀️🏃🏻‍♂️");
            } else if (runner <= 400) {
                System.out.print("🐎🦅");
            } else if (runner <= 600) {
                System.out.print("🐇🦘");
            } else if (runner <= 800) {
                System.out.print("🐤🐤");
            } else if (runner <= 900) {
                System.out.print("🐢🐢");
            } else if (runner <= 950) {
                System.out.print("🐛🐛");
            } else {
                System.out.print("🐌🐌");
            }
        }
        System.out.println();
    }
    
    public void go() {
        int RandomNumber = (int)(Math.random()*9001)+1000;
        System.out.print(" 🏃🏻‍♀️ 앞으로 가기 위해서는 같은 값의 입력이 필요합니다. " + RandomNumber + " : ");
        if(RandomNumber == sc.nextInt()) {
            System.out.println(" ⭕ 올바른 입력입니다. 앞으로 이동합니다.");
            run();
            event();
        } else {
            System.out.println(" ❌ 올바르지 않은 입력입니다. 다시 입력하세요.");
            go();
        }
    }

    public void menu() {
        while (true) {
            System.out.println("==========        TYL        ==========");
            System.out.println(green + "1. 모험하기 (운을 시험하기)");
            System.out.println(aqua + "2. 정보 열람 ");
            System.out.println(red + "3. 프로그램 종료");
            colorExit();
            String answer = sc.next();
            String answer1 = answer.replace(" ", "");

            if (answer1.equals("1. 모험하기") || answer1.equals("1 모험하기") || answer1.contains("모험") || answer1.contains("1") ) {
                System.out.println("무슨 일이 일어날까요 ? ");
                go();
                turn();
            } else if (answer1.equals("2. 정보 열람") || answer1.equals("2 정보 열람") || answer1.contains("정보") || answer1.contains("열람") || answer1.contains("2")) {
                System.out.println(" 목숨과 위치를 확인합니다. ");
                Event ev = new Event();
                ev.information();;
            } else if (answer1.equals("3. 프로그램 종료") || answer1.equals("3 프로그램 종료") || answer1.contains("프로그램") || answer1.contains("종료") || answer1.contains("3")) {
                System.out.println("프로그램을 종료합니다.");
                end();
            } else {
                System.out.println(" ❌ 올바른 명령어를 입력해주세요 :)");
            }
        }
    }

    public void end() {
        System.out.println("게임을 종료합니다.");
        System.exit(0);
    }

    public static void start() {
//        Event weakMan = new Event(10, 10,2,2, 1);
//        Event strongCoward = new Event(7,7,3,3, 2);
//        Event veteran = new Event(5,5,5,5,1);
        System.out.println("모험가를 고르세요. 1. Weak Man, 2. Strong Coward, 3. Veteran");
        Scanner sc = new Scanner(System.in);
        String adventurer = sc.nextLine();
        String adventurer1 = adventurer.replace(" ", ""); // 먼저 공백을 제거함

        // compareToIgnoreCase는 숫자를 반환해서 사용하기 어렵고(대소문자 구분이 없다는 것은 동일) equalsignoreCase()가 boolean 반환 => 개인적으로는 이게 더 사용하기 용이했다.
        // 그와 함께 contains를 추가해서 앞 단어만 입력해도 사용할 수 있도록 해보았다.
        if (adventurer1.equalsIgnoreCase("weak man") || adventurer1.equalsIgnoreCase("1. weak man") || adventurer1.equalsIgnoreCase("1 weak man")
                || adventurer1.contains("weak") || adventurer1.contains("1. weak") || adventurer1.contains("Weak") || adventurer1.contains("1. Weak") || adventurer1.contains("1")) {
//            weakMan.information();
            System.out.println(" 🧍🏻‍♂️️ 약한 사람을 골랐습니다. (모험 횟수 10 목숨 2 - HARD )");
            time = 10;
            allTime = 10;
            dead = 2;
            heart = 2;
            difficulty = 1;

        } else if (adventurer1.equalsIgnoreCase("Strong Coward") || adventurer1.equalsIgnoreCase("2. Strong Coward") || adventurer1.equalsIgnoreCase("2 Strong Coward")
                || adventurer1.contains("strong") || adventurer1.contains("2. strong") || adventurer1.contains("Strong") || adventurer1.contains("2. Strong") || adventurer1.contains("2")) {
            System.out.println(" 🧍🏻‍♂️ 힘센 겁쟁이를 골랐습니다. (모험 횟수 7 목숨 3 - NORMAL )");
            time = 7;
            allTime = 7;
            dead = 3;
            heart = 3;
            difficulty = 2;

        } else if (adventurer1.equalsIgnoreCase("veteran") || adventurer1.equalsIgnoreCase("3. veteran") || adventurer1.equalsIgnoreCase("3 veteran")
                || adventurer1.contains("veteran") || adventurer1.contains("3. strong") || adventurer1.contains("Veteran") || adventurer1.contains("3. Strong") || adventurer1.contains("3")) {
            System.out.println(" 🏃🏻‍♂️ 베테랑을 골랐습니다. (모험 횟수 5 목숨 5 - EASY )");
            time = 5;
            allTime = 5;
            dead = 3;
            heart = 3;
            difficulty = 1;

        } else {
            System.out.println(" ❌ 올바르게 입력해주세요.");
        }
    }

    // 색깔이 끝나게 만드는 메소드인데 그냥 System.out.println(exit);만 입력해도 되는데 이게 더 효율적이 맞을까? 조금 더 생각해볼 필요가 있다.
    public void colorExit () {
        System.out.println(exit);
    }
    
    public void event() {
        int randomEvent = (int)(Math.random()*101) + 1 ; // 1 ~ 100 까지 난수 생성
            if (randomEvent >= 35) { // 35% 좋은 이벤트, 65% 나쁜 이벤트
                Event evCool = new Cool();
                evCool.coolEvent();
                CoolItem ci = new CoolItem();
                if(cool == 1) {
                    ci.goldApple();
                    turn();
                } else if (cool == 2) {
                    if (dead < heart){
                        ci.medicinalHerb();
                        upHeart();
                    }
                } else if (cool == 3) {
                    ci.fruit();
                }
            } else {
                Event evBad = new Bad();
                evBad.badEvent();
                BadItem bi = new BadItem();
                if (bad == 1) {
                    bi.rottenApple();
                    heartBreak();
                } else if (bad == 2) {
                    bi.unknownFruit();
                    heartBreak();
                    heartBreak();
                } else if (bad == 3) {
                    bi.rottenWater();
                    heartBreak();
                } else if (bear == 0) {
                    if (dead < heart){
                        upHeart();
                    }
                }
                heartBreak();
            }
    }

    public void coolEvent() {
        System.out.println(blue + "😊😊😊😊😊 좋은 이벤트 발생 😊😊😊😊😊");
        colorExit();
    }

    public void badEvent() {
        System.out.println(red + " 😡😡😡😡😡 나쁜 이벤트 발생 😡😡😡😡😡 ");
        colorExit();
    }

    public void upTime() {
        time += 1;
    }

    public void upHeart() {
        dead += 1;
    }

    public void turn() {
        time -= 1; // time 값을 누적시킬 경우에는 다른 곳에서도 time을 넣어야 할 것 같아 private를 유지(캡슐화?)하기 위해, -로 넣고 0이 되면 게임이 종료되는 조건을 넣기로 했다.
        if (time == 0 && dead != 0) {
            clear();
        } else if (dead == 0) {
            over();
        }
    }

    public void heartBreak() {
        dead -= 1;
    }

    public void clear() {
            System.out.println(green + "오늘의 운은 좋은데요 ?");
            colorExit();
            System.exit(0);
    }

    public void over() {
            System.out.println(yellow + "오늘은 운이 없네요.");
            colorExit();
            System.exit(0);
    }

    public void info() {
//        System.out.println("모험 횟수 : " + black + time + exit + " / " + allTime + "\n목숨 : " + red + dead + exit + " / " + heart);
        if (dead == 3) {
            System.out.println("모험 횟수 : " + black + time + exit + " / " + allTime + "\n목숨 : " + green + dead + exit + " / " + heart);
        } else if (dead == 2) {
            System.out.println("모험 횟수 : " + black + time + exit + " / " + allTime + "\n목숨 : " + yellow + dead + exit + " / " + heart);
        } else if (dead == 1) {
            System.out.println("모험 횟수 : " + black + time + exit + " / " + allTime + "\n목숨 : " + red + dead + exit + " / " + heart);
        }

    }
    public void information() {
        if (difficulty == 1) {
            Event veteran = new Event();
            veteran.info();
        } else if (difficulty ==2) {
            Event strongCoward = new Event();
            strongCoward.info();
        } else {
            Event weakMan = new Event();
            weakMan.info();

        }
    }

//    public int getTime() {
//        return time;
//    }
//
//    public void setTime(int time) {
//        this.time = time;
//    }
//
//    public int getDead() {
//        return dead;
//    }
//
//    public void setDead(int dead) {
//        this.dead = dead;
//    }
//
//    public int getAllTime() {
//        return allTime;
//    }
//
//    public void setAllTime(int allTime) {
//        this.allTime = allTime;
//    }
//
//    public int getHeart() {
//        return heart;
//    }
//
//    public void setHeart(int heart) {
//        this.heart = heart;
//    }
//
//    public void setDifficulty(int difficulty) {
//        this.difficulty = difficulty;
//    }
//
//    public int getDifficulty() {
//        return difficulty;
//    }
//
//    public Event() {
//    }
//
//    public Event(int time, int allTime, int dead, int heart, int difficulty) {
//        this.time = time;
//        this.allTime = allTime;
//        this.dead = dead;
//        this.heart = heart;
//        this.difficulty = difficulty;
//    }
}
