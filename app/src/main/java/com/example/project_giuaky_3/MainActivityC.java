package com.example.project_giuaky_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityC extends AppCompatActivity {
    ArrayList<Poular> arrayList;
    private ListAdapter listAdapter;
    private ListView listView;
    private TextView tvSub;
    private TextView tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_c);

        tvSub = findViewById(R.id.tvPriceSub);
        tvTotal = findViewById(R.id.tvPriceTotal);

        arrayList = new ArrayList<>();
        Intent intent = getIntent();
        Poular poular = (Poular) intent.getSerializableExtra("pou");
        arrayList.add(poular);

        tvSub.setText(poular.getPricePoular());
        tvTotal.setText(tvSub.getText());

        listAdapter = new ListAdapter(MainActivityC.this,R.layout.list_item,arrayList);
        listView = findViewById(R.id.lvPoularCart);
        listView.setAdapter(listAdapter);

    }
}