package com.example.worth;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainScreen extends Activity implements OnClickListener {
	
	
	private ListView listview;
	private ArrayAdapter<String>  StringArrayAdapter;
	String [] items= {"webview","Addition", "Subtraction","Loginform", "Counter", "Toast", "Countries"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
		//initialization
		listview=(ListView) findViewById(R.id.items);
		ArrayList<String> itemlist= new ArrayList<String>();
		itemlist.addAll(Arrays.asList(items));
		//Design the listView
		StringArrayAdapter = new ArrayAdapter<String>(this, R.layout.mainscreen, itemlist);
        listview.setAdapter(StringArrayAdapter);
        listview.setOnClickListener(this);

	
	}
	
	public void onItemClick(AdapterView<?> arg0, View view, int position, long arg3) {
		String listdata= listview.getItemAtPosition(position).toString();	
		switch (position) {
			case 0:
				 startActivity(new Intent(getApplicationContext(),Addition.class)); 
                 break;
			case 1:
				startActivity(new Intent(getApplicationContext(),Subtraction.class)); 
                break;
			case 2:
				startActivity(new Intent(getApplicationContext(),Countries.class)); 
                break;
			case 3:
				startActivity(new Intent(getApplicationContext(),Increament.class)); 
                break;
			case 4:
				 startActivity( new Intent(getApplicationContext(), LoginForm.class));
                 
			case 5:
				startActivity (new Intent(getApplicationContext(), TabsActivity.class));
	
	
                
				
				break;

			default:
				break;
			}
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		/*webview screen
		webview webview;
		protected on create
		
	    initialize
		webview =(webview) findviewById(R.id.webview);
		webview.getSettings().setJavaScriptEnabled(true);
		webview.loadUrl("www.google.com");
		*/
		
		
	}
}

				
    


