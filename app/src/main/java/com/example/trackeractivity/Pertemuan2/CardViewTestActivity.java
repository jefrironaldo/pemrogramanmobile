package com.example.trackeractivity.Pertemuan2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trackeractivity.Adapter.MahasiswaRecyclerAdapter;
import com.example.trackeractivity.Model.Mahasiswa;
import com.example.trackeractivity.R;

import java.util.ArrayList;
import java.util.List;

public class CardViewTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list_cardview);

        RecyclerView rv = (RecyclerView)findViewById(R.id.cvMahasiswa);
        MahasiswaRecyclerAdapter mahasiswaRecyclerAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        //generate data mahasiswa
        Mahasiswa m1 = new Mahasiswa( "Naldo", "72160086","081230923350");
        Mahasiswa m2 = new Mahasiswa( "Jefri", "72160087","081222224545");
        Mahasiswa m3 = new Mahasiswa( "Ronaldo", "72160088","081324503211");
        Mahasiswa m4 = new Mahasiswa( "Jeron", "72160089","085299002211");
        Mahasiswa m5 = new Mahasiswa( "Asadama", "72160090","081234567890");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

        mahasiswaRecyclerAdapter = new MahasiswaRecyclerAdapter(CardViewTestActivity.this);
        mahasiswaRecyclerAdapter.setMahasiswaList(mahasiswaList);

        rv.setLayoutManager(new LinearLayoutManager(CardViewTestActivity.this));
        rv.setAdapter(mahasiswaRecyclerAdapter);
    }
}
