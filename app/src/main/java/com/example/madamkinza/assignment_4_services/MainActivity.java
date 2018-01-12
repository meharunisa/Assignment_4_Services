package com.example.madamkinza.assignment_4_services;

import java.util.ArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) this.findViewById(R.id.list1);

        // DataSource
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User(1, "Mehar", "88945778265"));
        for (int i = 1; i < 1000; i++) {
            arrayList.add(new User(i + 1, "Mehar " + i,i+ " CONTACT NUMBER : 878657657888"));
        }

        UserAdapter userAdapter = new UserAdapter(this, arrayList);

        listView.setAdapter(userAdapter);


    }
}
