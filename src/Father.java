public class Father extends GrandFather{
    private String carName;
    private Habits habits;
    private House house;
    private String job;

    public Father(int age, String name, String carName, Habits habits, House house, String job) {
        super(age, name);
        this.carName = carName;
        this.habits = habits;
        this.house = house;
        this.job = job;
    }


    public String getCarName() {
        return carName;
    }

    public Habits getHabits() {
        return habits;
    }

    public House getHouse() {
        return house;
    }

    public String getJob() {
        return job;
    }

    public final void makeVoice(){
        System.out.println("Hello World");
    }

    public void makeVoice(String voice){
        System.out.println(voice);;
    }

    public String getInfo(){
        return "Age: " + getAge() +
                "\nName: " + getName() +
                "\nHabits: " + getHabits() +
                "\nHouse: " + getHouse() +
                "\nCar name: " + this.carName +
                "\nJob: " + this.job;
    }

}
