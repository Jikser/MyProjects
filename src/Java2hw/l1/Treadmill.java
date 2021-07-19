package Java2hw.l1;

public class Treadmill implements Usable {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void use(User user) {
        if (user.getFailed()==true) {
            return;
        }
        if (getDistance() > user.getDistanceLenght()) {
            System.out.println(user.getType() + " " + user.getName() + " Не пробежал. Cошел с дистанции.");
            user.setFailed(true);
        } else {
            System.out.println(user.getType() + " " + user.getName() + " Пробежал");

        }
    }

}
