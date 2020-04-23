package com.example.android.samisg4.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.example.android.samisg4.R;
import com.example.android.samisg4.Rest.ApiClient;
import com.example.android.samisg4.Rest.ApiSirver;
import com.example.android.samisg4.adapter.LessonsAdapter;
import com.example.android.samisg4.models.BaseClass;
import com.example.android.samisg4.models.Item;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EnglishActivity extends AppCompatActivity {
   ArrayList<BaseClass> myDataSource = new ArrayList <BaseClass>();
    ArrayList <Item> items= new ArrayList <>();
String data="";
    LessonsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ListView listView = (ListView) findViewById(R.id.words_list_view);
         adapter = new LessonsAdapter(EnglishActivity.this,items);
        listView.setAdapter(adapter);

        loadData();
    }
    public void loadData()
    {
        final ApiSirver apiService =
                ApiClient.getClient().create(ApiSirver.class);
        Call <BaseClass>  call = apiService.getUser();
        call.enqueue(new Callback <BaseClass> () {
            @Override
            public void onResponse(Call<BaseClass>  call, Response <BaseClass>  response) {
                myDataSource.clear();
                items.addAll(response.body().getItems());
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<BaseClass> call, Throwable t) {
                Toast.makeText(EnglishActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });


    }
}
