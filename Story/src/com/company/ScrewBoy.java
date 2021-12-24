package com.company;

public class ScrewBoy {
    protected String name = " Шурупчик";
    public String travel(){
        return name + " поехал проверить, что " + accident.happen();
    }
    Accident accident = new Accident();
    protected static class Accident{
        protected String name = "несчастный случай";
        public String happen(){
            return name + " не произошёл.";
        }
    }
    public String Arrive(){
        return bublik.work();
    }
    Bublik bublik = new Bublik();
    protected class Bublik {
        protected String name = " Бублик";
        public String work(){
            return ScrewBoy.this.name + " приехал в Зеленый город, и, когда увидел,что " + name + " работает со своей машиной на уборке фруктов,";
        }
    }
}
