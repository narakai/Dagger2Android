package clem.app.dagger2_android.bean;

public class Teacher {
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    private String mName;

    public Teacher(String name) {
        mName = name;
    }
}
