package org.msh.gotopapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Giant extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[] {"Call Center",
                "SMS Center", "Driving Direction", "Website", "Info di Google", "Exit" };
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
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
            if (pilihan.equals("Call Center")) {
                String nomortel = "0761-589923";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            }else if (pilihan.equals( "SMS Center"))
            {
                String smsText="Oktarizal Al Rasyid H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms: 082284038137"));
                a.putExtra("smsbody",smsText);
            }else if (pilihan.equals( "Driving Direction"))
            {
                String lokasirs =" http://maps.google.com/maps?saddr=(0.4579471%2C101.3627446)&daddr=Rumah&geocode=Fdv8BgAdOKwKBg%3D%3D%3BFXAWBwAdIgELBimpVC40WajVMTHfrS4z64I3wQ%3D%3D&dirflg=d";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            }else if (pilihan.equals( "Website"))
            {
                String website = "https://www.giant.co.id/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            }else if (pilihan.equals( "Info di Google"))
            {
                a = new Intent((Intent.ACTION_WEB_SEARCH));
                a.putExtra(SearchManager.QUERY,"Giant Panam");
            }


            startActivity(a);

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

