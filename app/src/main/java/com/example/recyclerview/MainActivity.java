package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];
    int images[] = {R.drawable.oogway, R.drawable.po, R.drawable.spiderman, R.drawable.superman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        s1 = getResources().getStringArray(R.array.my_super_heroes);
        s2 = getResources().getStringArray(R.array.description);

        Adapter adapter = new Adapter(this,s1,s2,images);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}