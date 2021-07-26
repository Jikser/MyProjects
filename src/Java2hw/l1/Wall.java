package Java2hw.l1;

public class Wall implements Usable {

    private int height = 0;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public void use(User user) {

        if (user.getFailed()==true){
            return;
        }  else if (getHeight() > user.getJumpLenght()){
            System.out.println( user.getType() + " " + user.getName() + " Не перепрыгнул. Сошел с дистанции");
            user.setFailed(true);
        } else {
            System.out.println(user.getType() + " " + user.getName() + " Перепрыгнул");
        }
    }
}
