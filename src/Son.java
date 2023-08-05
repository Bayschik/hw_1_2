public final class Son extends Father{

    private String schoolName;

    public Son(int age, String name, String carName, Habits habits, House house, String job, String schoolName) {
        super(age, name, carName, habits, house, job);
        this.schoolName = schoolName;
    }


    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public void makeVoice(String voice) {
        super.makeVoice(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nStudies: " + schoolName;
    }
}
