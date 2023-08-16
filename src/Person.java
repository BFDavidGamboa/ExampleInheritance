public class Person {
    private String name;
    private char genre;
    private int age;
    private String direction;

    public Person(){
    }

    public Person(String name){
        this.name =name;
    }

    public Person(String name, char genre, int age, String direction){
        this.name = name;
        this.genre = genre;
        this.age = age;
        this.direction = direction;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                ", age=" + age +
                ", direction='" + direction + '\'' +
                '}';
    }
}
