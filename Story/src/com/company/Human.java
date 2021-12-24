package com.company;
//абстрактный класс людей
public abstract class Human implements HumanAction{
    protected String name;
    public Human(String name) { this.name = name;}

    protected WaitStatus waitCondition = WaitStatus.dont_wait;



    public WaitStatus getWaitCondition() {
        return waitCondition;
    }
    public void wait(Human human) {
        human.waitCondition = WaitStatus.wait;
    }




    }

class He extends Resident {

    public He(String name) {
        super(name);
    }
    String GoBack(){
        return name + " не вернулся даже на следующий день.";
    }
    String Haul(){ return  name + " повез на своей машине Винтика и Шпунтика в Зеленый город." ;}
    String On(){
        return name + " не выдержал и тоже включился в работу.";
    }
}
class First extends Resident{
    public First(String name) {
        super(name);
    }
    @Override
    String Speak(MonsterStatus status){
        return name + " говорили, что на дороге к Зеленому городу поселилась " + status.getLabel() + " - костяная нога, которая поедает всех, кого увидит.";
    }
}
class Another extends Resident{
    public Another(String name) {
        super(name);
    }
    @Override
    String Speak(MonsterStatus status){
        return name + " говорили, что это не Баба-Яга, а " + status.getLabel();
    }
}
class Third extends Resident{
    public Third(String name) {
        super(name);
    }
    @Override
    String Speak(MonsterStatus status){
        return name + " спорили и доказывали,, что кащеев бессмертных не бывает, а это трехголовый " + status.getLabel();
    }
}



