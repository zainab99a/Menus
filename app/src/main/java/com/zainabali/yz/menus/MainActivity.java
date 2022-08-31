package com.zainabali.yz.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button_menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_menu=findViewById(R.id.btn_menu);
        registerForContextMenu(button_menu);//method خاصه للضغط المطول حتى تعرض الفلوتنك منيو



    }//end create()




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();//inflater هوclass استخدمه حتى اربط التصميم مال القائمه بالجافا
        inflater.inflate(R.menu.options_menu, menu);//اكتب اسم directory name
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {//لتفعيل الضغط على ال item
        switch (item.getItemId()) {
            case R.id.about_us:
                Toast.makeText(this, "You Clicked About Us", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.exit:
                Toast.makeText(this, "You Clicked Exit", Toast.LENGTH_SHORT).show();
                return true;

            default: return super.onOptionsItemSelected(item);
    }}//end options menu

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.floating_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {
            case R.id.del:
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.archive:
                Toast.makeText(this, "Archive", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                return true;
            default: return super.onContextItemSelected(item);
    }}//end context menu
}//end class