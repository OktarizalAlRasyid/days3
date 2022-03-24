package org.msh.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

public class TokoBelanja extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listTokoBelanja = new String[] {"Giant Panam" ,"Ramayana"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listTokoBelanja));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Giant Panam")) {
                a = new Intent(this, Giant.class);



            }else if (pilihan.equals( "Ramayana"))
            {

            }
            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }



}

