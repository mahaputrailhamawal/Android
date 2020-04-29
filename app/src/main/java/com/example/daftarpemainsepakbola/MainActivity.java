package com.example.daftarpemainsepakbola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayer;
    private ArrayList<Player> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setActionBarTitle(title);

        rvPlayer = findViewById(R.id.rv_Player);
        rvPlayer.setHasFixedSize(true);

        list.addAll(PlayerData.getListData());
        //showRecyclerList();
        showRecyclerCardView();
    }

//    private void  showRecyclerList(){
//        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
//        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
//        rvPlayer.setAdapter(listPlayerAdapter);
//    }

    private void showRecyclerCardView(){
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        CardViewPlayerAdapter cardViewPlayerAdapter = new CardViewPlayerAdapter(list);
        rvPlayer.setAdapter(cardViewPlayerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(moveIntent);
        //setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
//
//    public void setMode(int selectedMode){
//        switch (selectedMode){
//            case R.id.about:
//
//                break;
//        }
//    }
}
