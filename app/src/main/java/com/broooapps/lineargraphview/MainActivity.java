package com.broooapps.lineargraphview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.broooapps.lineargraphview2.DataModel;
import com.broooapps.lineargraphview2.LinearGraphView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearGraphView lgv = findViewById(R.id.lgv);

        List<DataModel> dm = new ArrayList<>();

        dm.add(new DataModel("One", "#00ffff", 20));
        dm.add(new DataModel("Two", "#74EEA1", 15));
        dm.add(new DataModel("Three", "#f2002f", 65));

        lgv.setData(dm, 100);
    }
}
