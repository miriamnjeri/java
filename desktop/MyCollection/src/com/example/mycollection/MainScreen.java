package com.example.mycollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import android.R.integer;
import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class MainScreen extends ActionBarActivity implements OnItemClickListener {
	private ListView listview;
	private ArrayAdapter<String>  StringArrayAdapter;
	String [] planets= {"mercury", "Earth","venus", "Neptune", "mars", "pluto", "sartun","jupiter","uranus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        //initialization
        listview=(ListView) findViewById(R.id.mainlist);
        
        ArrayList<String> planetlist = new ArrayList<String>();
        planetlist.addAll(Arrays.asList(planets));
      //Design the listView
        StringArrayAdapter = new ArrayAdapter<String>(this, R.layout.simplelayout, planetlist);
        listview.setAdapter(StringArrayAdapter);
        listview.setOnItemClickListener(this);

    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
		for (int i=0; i < planets.length; i++){
		
		}
			
			String listData = listview.getItemAtPosition(position).toString();
			
		
			Toast.makeText(getApplicationContext(), listData + ":" + position, Toast.LENGTH_LONG).show();
		
		
	
	}
    

}
