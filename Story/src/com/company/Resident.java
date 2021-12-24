package com.company;

public class Resident extends Human implements ResidentAction{
    public Resident(String name){
        super(name);
    }
    private ResidentStatus residentStatus = ResidentStatus.dont_speak;

    public void speak(Resident resident){
        residentStatus = ResidentStatus.speak;
    }
    public String Wait(){
        waitCondition = WaitStatus.wait;
       return name + " прождали его до вечера,";
    }
     String Speak(MonsterStatus status){
        return name + " говорили";
    }
     String Knowing(){
        return name + " знали, что ";
    }

}
