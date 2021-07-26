package Java2hw.l1;

public class Cat implements User {
    private String type;
    private String name;
    private int maxJump;
    private int maxDistanse;
    private boolean failed = false;


    public Cat(String name, int maxJump, int maxDistanse) {
        type = "Cat";
        this.name = name;
        this.maxJump = maxJump;
        this.maxDistanse = maxDistanse;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getFailed() {
        return failed;
    }

    @Override
    public int getJumpLenght() {
        return maxJump;
    }

    @Override
    public int getDistanceLenght() {
        return maxDistanse;
    }

    @Override
    public void setFailed(boolean failed) {
        this.failed = failed;


    }
}
