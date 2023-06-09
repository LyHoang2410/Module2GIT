package Day_14_4;

public class People {
    private static int INDEX = 0;
    private int id;
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.id = ++INDEX;
        this.name = name;
        this.age = age;
    }

    public static int getINDEX() {
        return INDEX;
    }

    public static void setINDEX(int INDEX) {
        People.INDEX = INDEX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
