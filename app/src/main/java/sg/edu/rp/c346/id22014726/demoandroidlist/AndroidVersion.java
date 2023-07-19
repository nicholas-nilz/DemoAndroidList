package sg.edu.rp.c346.id22014726.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidVersion extends AppCompatActivity {

    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

//    @Override
//    public String toString() {
//        return "AndroidVersion{" +
//                "name='" + name + '\'' +
//                ", version='" + version + '\'' +
//                '}';

    @Override
    public String toString () {
        return name + ": " + version;
    }
}
