# Try Your Luck (MiniGame)
just go(for time) && dead stack.

단순히 운을 시험하는 게임입니다.
무작정 엔터를 치는 것을 방지하고자 랜덤숫자를 입력해서 앞으로 나아가고 죽음스택을 3번쌓지않고
7번 이벤트를 보게되면 성공입니다.

그 전에 죽는다면 운이 나쁘다고 할 수 있는 운을 시험해볼 수 있는 간단한 미니게임입니다.

모험을 한다는 선택지가 하나인 미니게임으로 마구잡이로 앞으로 가기만 하면 너무나 허무한 게임이 될 수 있어 무작정 엔터를 쳐서 넘어가는 것을 방지하기 위해
여행을 할 때마다 무작위 숫자 4자리 조합을 똑같이 입력해서 앞으로 나아갈 수 있습니다.

============================================================================================
### 1. three advanturer & similar pattern but nature feature. (Select one & Random)
난이도 느낌으로 각 모험가당 확률이 다르며 기본값은 Strong Coward 이지만 선택할 수 있습니다.
각 난이도에 맞게 여행시간과 목숨이 정해집니다.
#### 1-1) Weak man
Weak man is weak. but lucky. (similar hard)
#### 1-2) Strong Coward
Base Difficulty : Try Your Luck
#### 1-3) Veteran
Real man is strong and lucky. (similar easy)

## 2. A total of seven trips are given random situations. (Each event has a stack of time.)
## 2. Good Event
### 2-1 Nothing Happens.
### 2-2 met a bear. but hide.
### 2-3 get and use item. (Each other)
### 2-4 found a village.

## 3. Bad Event
### 3-1 hurt. (1 deadstack)
### 3-2 meet the Bear.
### 3-3 get and use item. (Each other)
### 3-4 lose one's footing. (3 deadstack)
### 3-5 stir up a hornet's nest (1 deadstack)

## Object
### 1. Adventurer & Event
    1-1 모험가는 게임을 시작할 수 있고 모험을 할 수 있다.
    1-2 이벤트는 게임이 시작될 수 있고 모험을 할 때마다 이벤트가 등장할 수 있다.

### 2. Event & Cool
     2-1 이벤트는 좋은 이벤트가 나타날 수 있다.
     2-2 좋은 이벤트는 랜덤 이벤트 중 나타날 수 있다.
     2-3 이벤트에서 아무일이 없거나, 곰을 만났지만 무사히 도망가거나, 마을 발견, 하루를 무사히 넘기는 이벤트가 나타날 수 있다.
     2-4 좋은 이벤트 중에서 아무 일도 없거나, 곰을 만났지만 무사히 도망가거나, 마을 발견, 하루를 무사히 넘기는 이벤트가 나타난다.
     2-5 이벤트 중에서 아이템 이벤트가 나타날 수 있다.
         2-6. Cool & CoolItem
                  2-7) 좋은 이벤트 중에서 좋은 아이템이 등장할 수 있다.
                  2-8) 좋은 아이템에서 황금 사과, 약초, 먹음직스러운 과일을 얻을 수 있다.
### 3. Event & Bad
     3-1. 이벤트는 나쁜 이벤트가 나타날 수 있다.
     3-2. 나쁜 이벤트는 랜덤 이벤트 중 나타날 수 있다.
     3-3. 이벤트에서 다치거나, 곰을 만나거나, 건강 악화, 낭떠러지에서 낙하할 수 있다.
     3-4. 나쁜 이벤트에서는 다치거나, 곰을 만나거나, 벌집을 건드리거나, 낭떠러지에서 떨어질 수 있다.
         3-5. Bad Event & Bear
              3-5. 나쁜 이벤트에서 등장하는 곰의 공격 행동 패턴은 여러가지가 있고 랜덤으로 등장한다.
         3-7. Bad Event & BadItem
              3-8. 나쁜 이벤트에서 나쁜 아이템이 등장할 수 있다.
              3-9. 나쁜 아이템에서 썩은 사과, 치명적인 사과, 썩은 물이 나올 수 있다.
