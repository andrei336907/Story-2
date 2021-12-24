package com.company;

import java.util.Objects;

public abstract class Monster {
    protected String name;

    public Monster(String name) {
        this.name = name;
    }

    private MonsterStatus monsterStatus = MonsterStatus.Baran;


//    public void BeBaba(Monster monster) {monsterStatus = MonsterStatus.Baba_Yaga;}
//
//    public void BeKoshey(Monster monster) {
//        monsterStatus = MonsterStatus.Koshey;
//    }
//
//    public void BeDragon(Monster monster) {
//        monsterStatus = MonsterStatus.Dragon;
//    }
// класс дракона, описывающий его действия
    static class Dragon extends Monster{
        public Dragon(String name) {
            super(name);
        }

        public Dragon() {
            super("Дракон");
        }

        String Eat(EatStatus eatStatus){
           // return name + "Каждый день ест по одной малышке, ";
            if (eatStatus == EatStatus.BabyBoy)
                return name + " каждый день ест по одной малышке, когда в городе появляется малыш " + name + " ест малыша, потому что малыши лучше малышек ";
            else
                return name + " каждый день ест по одной малышке, " + name + "хавает малышек, у него нет выбора";
        }
        String Settle(){
            return name + " поселился не на дороге, а в самом Зеленом городе. ";
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(name, monster.name) && monsterStatus == monster.monsterStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, monsterStatus);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", monsterStatus=" + monsterStatus +
                '}';
    }
}
