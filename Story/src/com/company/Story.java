package com.company;

import java.util.Objects;
import java.util.Scanner;

interface Disappearance{
    String disappear();
}
// класс который собирает историю
public class Story {
    private Resident first;
    private Resident another;
    private Resident third;
    private Monster.Dragon dragon;

    //
    public void AddFirst(Resident first) { this.first = first;}
    public void AddAnother(Resident another) { this.another = another;}
    public void AddThird(Resident third) { this.third = third;}
    public void AddDragon(Monster.Dragon dragon) { this.dragon = dragon;}
    ScrewBoy screwBoy = new ScrewBoy();
    // лямбда выражение которое выводит конец истории.
    Disappearance newdisappearance = () -> {
        return " В городе все съедены нахуй";
    };
    // Анонимный класс
    Disappearance disappearance = new Disappearance() {
        @Override
        public String disappear() {
            return " В городе Змеевке было замечено исчезновение Бублика.";
        }
    };

    // класс который реализует историю
    public void go() {
        // локальный класс
        class AllPeople{
            protected String name = " Все";
            public String ask(ScrewBoy screwBoy1){
                return name + " стали просить " + screwBoy.name + "a разузнать об этом. ";
            }
        }

        AllPeople allPeople = new AllPeople();
        System.out.println(disappearance.disappear());
        System.out.print(new Resident(" Жители").Knowing());
        System.out.println(new He(" он").Haul());

        System.out.println(allPeople.ask(screwBoy));
        System.out.println(new ScrewBoy().travel());
        System.out.print(new ScrewBoy().Arrive());
        System.out.println(new He(" он").On());

        first.Wait();
        another.Wait();
        third.Wait();
// Блок в котором может произойти исключение действий жителей
        while (true){
            try {
                System.out.println(" Что делали жители? ");
                Scanner scanner = new Scanner(System.in);
                String wordInput = scanner.next();

                if (!Objects.equals(wordInput, "ждали")){
                    throw new FuckingException();
                }
                break;
            } catch (FuckingException e){
                System.out.println(e);
            }
        }
//условие продолжения истории
        if (first.getWaitCondition() == WaitStatus.wait && another.getWaitCondition()==WaitStatus.wait && third.getWaitCondition()==WaitStatus.wait) {
            System.out.print(new Resident(" Жители Змеевки").Wait());
            System.out.println(new He(" но он").GoBack());

        }

        GossipStatus status;
// блок в котором может произойти исключение слухов
        while (true){
            try {
                System.out.println(" Это было инфоповодом? ");
                Scanner scanner = new Scanner(System.in);
                String wordInput = scanner.next();

                if (!Objects.equals(wordInput, "да")){
                    throw new FuckingException();
                }
                status = GossipStatus.spread;
                break;
            //обработка исключения
            } catch (FuckingException e){
                System.out.println(e);
            }
        }


//условие продолжения истории от исключения
        Gossip gossip = new Gossip();
        if(status == GossipStatus.spread) {
            System.out.println(gossip.Spread(status));
            System.out.println(new First(" Одни").Speak(MonsterStatus.Baba_Yaga));
            System.out.println(new Another(" Другие").Speak(MonsterStatus.Koshey));
            System.out.println(new Third(" Третьи").Speak(MonsterStatus.Dragon));

        }
        EatStatus eatStatus;
        System.out.println(dragon.Settle());
// блок в котором может произойти исключение
        while (true){
            try {
                System.out.println(" Сколько в городе малышей? ");
                Scanner scanner = new Scanner(System.in);
                int countInput = scanner.nextInt();

                if (countInput < 1){
                    throw new BabiesException();
                }
                eatStatus = EatStatus.BabyBoy;
                break;
            // обработка исключения
            } catch (BabiesException e) {
                System.out.println(e);
            }

        }
//последнее условие для истории
        if (eatStatus == EatStatus.BabyBoy){
            System.out.println(new Monster.Dragon(" Дракон").Eat(EatStatus.BabyBoy));

        }
        System.out.println(newdisappearance.disappear());
    }

}
