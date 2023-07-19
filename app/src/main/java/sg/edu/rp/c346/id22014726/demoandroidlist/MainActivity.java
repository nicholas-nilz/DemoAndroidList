package sg.edu.rp.c346.id22014726.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> alAndroidVersions;
    //ArrayAdapter<AndroidVersion> aaAndroidVersions;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv);
        alAndroidVersions = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);

//        al.add("Pie - 9.0");
//        al.add("Oreo - 8.0 - 8.1");
//        al.add("Nougat - 7.0 - 7.1.2");
//        al.add("Marshmallow - 6.0 - 6.0.1");
//        al.add("Lollipop - 5.0 - 5.1.1");
//        al.add("KitKat - 4.4 - 4.4.4");
//        al.add("JellyBean - 4.1 - 4.3.1");

//        aaAndroidVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alAndroidVersions);
        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersions);
        lv.setAdapter(adapter);
    }
}