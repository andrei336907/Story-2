package com.company;

public enum MonsterStatus {
    Baran("Бэрэн"),
    Baba_Yaga("Баба-Яга"),
    Koshey("Кощей"),
    Dragon("Дракон");

    public final String label;
    MonsterStatus(String label) { this.label = label;}
    public String getLabel() {
        return  label;
    }
}
