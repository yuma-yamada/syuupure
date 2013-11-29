package com.example.onecall;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by rice on 13/11/29.
 */
public class TitleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title_select);
        //リストの設定
        ListView lv = (ListView) this.findViewById(R.id.listView2);
        String[] mail = this.getResources().getStringArray(R.array.sub_add);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,R.layout.listitem,mail);
        lv.setAdapter(adp);
    }
}
