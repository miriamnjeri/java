package com.example.thegreat;

import java.util.ArrayList;
import java.util.Arrays;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.os.Build;

public class MainScreen extends ActionBarActivity implements OnClickListener {
	private static final string[] Itemlist = null;
	private ListView listview;
	private ArrayAdapter<string> stringArrayAdapter;
		
	String [] items= {"Addition", "Subtraction","Login form", "Counter", "Toast", "Countries"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		//initialization
		listview=(ListView) findViewById(R.id.items);
		
		ArrayList<String> itemlist= new ArrayList<String>();
		itemlist.addAll(Arrays.asList(items));
		//Design the listView
		
		stringArrayAdapter = new ArrayAdapter<string>(this,R.layout.mainscreen,Itemlist);
        listview.setAdapter(stringArrayAdapter);
        listview.setOnClickListener(this);

	
	}

	
	public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
		for (int i=0; i < items.length; i++){
			
		}
			
			String listData = listview.getItemAtPosition(position).toString();
					
			
			
			Toast.makeText(getApplicationContext(), listData + ":" + position, Toast.LENGTH_LONG).show();
			
		
		
			
		}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}


}
	
