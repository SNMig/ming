package com.javabase.week2day003;


class ChickenEgg extends Egg {
    public ChickenEgg() {

    }

}

class DuckEgg extends Egg {
    public DuckEgg() {

    }
}

class Egg {

}

class Blaket {
    private Egg egg;
    public Blaket(Egg egg){
        this.egg=egg;
    }

    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }
}

public class Job1 {
    public static void main(String[] args) {
        Blaket blaket1 = new Blaket(new ChickenEgg());




    }
}

