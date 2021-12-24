package com.company;

public enum WaitStatus {
    wait(""),
    dont_wait("");

    public final String label;
    WaitStatus(String label) { this.label = label;}
}
