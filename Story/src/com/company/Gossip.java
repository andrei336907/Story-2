package com.company;

public class Gossip{
    protected String name = "Слухи";



    public String Spread(GossipStatus gossipStatus){
        if (gossipStatus == GossipStatus.spread)
            return " Самые невероятные " + name + " стали распространяться по всему городу. ";
        else
            return name + "Он никому не интересен((";
    }
}
