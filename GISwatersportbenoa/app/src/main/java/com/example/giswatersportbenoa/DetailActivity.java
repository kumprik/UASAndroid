package com.example.giswatersportbenoa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
        TextView datanama,datawahana,datatelpon;
        Button btncall;
        ImageView datagambar;
        public static String id,nama,wahana,telpon,gambar;
        public static double latitude,longitude;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        datawahana=findViewById(R.id.tv_wahana);
        datatelpon=findViewById(R.id.tv_telpon);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        datawahana.setText(wahana);
        datatelpon.setText(telpon);
        Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent call= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telpon));
        startActivity(call);
    }
}
