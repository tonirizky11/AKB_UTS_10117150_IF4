package com.toni.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class slide extends AppCompatActivity {

    TextView judul;
    TextView isi;
    ImageView gambar;
    int halaman = 0;

    String[] judul_artikel = new String[]{
      "Cari Makan ",
            "Kota",
            "Meluncur"
    };

    String[] isi_artikel = new String[]{
      "Aplikasi Cari makan adalah sebuah aplikasi dimana kamu sebagai pecinta makanan bisa mencari tau apa dan dimana saja makan khas indonesia",
            "Cari makan Di berbagai kota di indonesia memiliki banyak makan khas daerah yang tentu berbeda cita rasa dan khas daerah kota tersebut",
            "tunggu apa lagi ? hayuu meluncur cari makan"
    };

    int[] gambar_artikel = new int[]{
      R.drawable.food,
            R.drawable.ic_cari,
            R.drawable.ic_location


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        judul = (TextView)findViewById(R.id.judul);
        isi = (TextView)findViewById(R.id.isi);
        gambar = (ImageView)findViewById(R.id.gambar);

        judul.setText(judul_artikel[halaman]);
        isi.setText(isi_artikel[halaman]);
        gambar.setImageResource(gambar_artikel[halaman]);
    }

    public void prev(View view) {
        if (halaman > 0) {
            halaman--;
            judul.setText(judul_artikel[halaman]);
            isi.setText(isi_artikel[halaman]);
            gambar.setImageResource(gambar_artikel[halaman]);
        }
    }

    public void next(View view) {

        if (halaman < 2) {
            halaman++;
            judul.setText(judul_artikel[halaman]);
            isi.setText(isi_artikel[halaman]);
            gambar.setImageResource(gambar_artikel[halaman]);
        }
        else {
            Toast.makeText(this, "selanjutnya",Toast.LENGTH_SHORT);
            Intent i = new Intent(slide.this, MainActivity.class);
            startActivity(i);
        }
    }
}

/**
 * nama : Toni Rizky Awalludin
 * Nim : 10117150
 * kelas : IF-4
 * tanggal pengerjaan : 7 - 15 mei 2020
 */

