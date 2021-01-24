package examples.computer;

// Credit goes to Goushi Kubota

public abstract class Monitor {
    abstract public void leftClick();
}


private abstract class Champion {
    public int HP;
    public int MP;
    public Champion() {
        HP = 30;
        MP = 10;
    }

    public abstract void leftClick();
}

private class Garen extends Champion {
    public void printHp() {
        System.out.println(HP);
    }

    public Garen() {
        super();
        HP = 300;
    }

    public void leftClick() {
        int x;
        x = 3;
    }
}