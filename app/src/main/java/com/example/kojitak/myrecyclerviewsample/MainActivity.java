package com.example.kojitak.myrecyclerviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //xmlのid取得（表示場所取得）
        RecyclerView rv = (RecyclerView) findViewById(R.id.casarealRecyclerView);
        CasarealRecycleViewAdapter adapter = new CasarealRecycleViewAdapter(this.createDataset());

        LinearLayoutManager llm = new LinearLayoutManager(this);
        //固定長かどうか
        rv.setHasFixedSize(true);

        rv.setLayoutManager(llm);

        rv.setAdapter(adapter);
    }

    /**
     * わかりやすいように表示データは
     * ループで作成する
     * @return
     */
    private List<RowData> createDataset() {

        List<RowData> dataset = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            RowData data = new RowData();
            data.setTitle("カサレアル　太郎" + i + "号");
            data.setDetail("カサレアル　太郎は" + i + "個の唐揚げが好き");

            dataset.add(data);
        }
        return dataset;
    }
}
