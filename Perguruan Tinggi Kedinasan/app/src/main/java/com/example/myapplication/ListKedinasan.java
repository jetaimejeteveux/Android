package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListKedinasan extends ArrayAdapter<Kedinasan> {
    private Activity context;
    private List<Kedinasan> kedinasanList;

    public ListKedinasan(Activity context, List<Kedinasan> kedinasanList) {
        super(context, R.layout.item_kedinasan, kedinasanList);
        this.context = context;
        this.kedinasanList = kedinasanList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();//Beda dengan souce code mas agum
        View listViewItem = inflater.inflate(R.layout.item_kedinasan, null, true);

        TextView tvNama =  listViewItem.findViewById(R.id.tvNama);
        TextView tvWeb = listViewItem.findViewById(R.id.tvWeb);

        Kedinasan kedinasan = kedinasanList.get(position);
        tvNama.setText(kedinasan.getInstitusiNama());
        tvWeb.setText(kedinasan.getInstitusiWeb());

        return listViewItem;
    }
}