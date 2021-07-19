package Java2hw.l1;

public interface User {
    String getType();
    String getName();

    boolean getFailed();

    int getJumpLenght();

    int getDistanceLenght();

    void setFailed(boolean failed);
}
