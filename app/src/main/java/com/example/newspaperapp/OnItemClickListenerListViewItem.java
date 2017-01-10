package com.example.newspaperapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Ver on 1/8/2017.
 */

public class OnItemClickListenerListViewItem implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Context ctx = view.getContext();

        TextView textViewItem = ((TextView) view.findViewById(R.id.textViewItem));

        String listItemText = textViewItem.getText().toString();
        String listItemId = textViewItem.getTag().toString();

        Intent intent = new Intent(ctx, ArticleActivity.class);
        intent.putExtra("link", listItemText);

        ctx.startActivity(intent);
    }

}
