package org.msh.gotopapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickrs(View view) {
        //gambar rs diclick
        Intent i = new Intent(this, rs.class);
        startActivity(i);

    }

    public void clickPolisi(View view) {
        //gambar Polisi diclick
        Intent i = new Intent(this, Polisi.class);
        startActivity(i);
    }
    public void clickTokoBelanja(View view) {
        //gambar TokoBelanja diclick
        Intent i = new Intent(this, TokoBelanja.class);
        startActivity(i);
    }
}