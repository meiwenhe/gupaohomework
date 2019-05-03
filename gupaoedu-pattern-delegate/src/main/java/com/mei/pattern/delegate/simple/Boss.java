package com.mei.pattern.delegate.simple;

public class Boss {
    private Leader leader;
    public Boss(Leader leader){
        this.leader = leader;
    }
    public void commond(String commond){
        leader.doing(commond);
    }
}
