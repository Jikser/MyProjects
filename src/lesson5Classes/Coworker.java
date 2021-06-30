package lesson5Classes;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Coworker {
    private String surname;
    private String name;
    private String nameFather;
    private String post;
    private String email;
    private int numberPhone;
    private double salary;
    private int age;

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Coworker(String surname, String name, String nameFather, String post, String email, int numberPhone, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.nameFather = nameFather;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.printf("Фамилия: %s, Имя: %s, Отчество: %s, Должность: %s, email: %s, Номер телефона: %d, Зарплата: %f $, Возраст: %d", surname, name, nameFather, post, email, numberPhone, salary, age);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getNameFather() {
        return nameFather;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Override
    public String toString() {
        return "Coworker{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", nameFather='" + nameFather + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone=" + numberPhone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
