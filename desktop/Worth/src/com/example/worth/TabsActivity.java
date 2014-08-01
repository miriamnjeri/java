package com.example.worth;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabsActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabs);
		
		//instanciating the tab host
		TabHost tabHost= getTabHost();
		Resources resources = getResources();
		
		//set tab one
		Intent homeActivity=new Intent().setClass(getApplicationContext(), HomeActivity.class);
		TabSpec homeTabSpec = tabHost.newTabSpec("Home").setIndicator("",resources.getDrawable(R.id.icon)).setContent(homeActivity);
		
		Intent ContactActivity = new Intent().setClass(getApplicationContext(), ContactActivity.class);
		TabSpec contactTabSpec = tabHost.newTabSpec("Contact us").setIndicator("",resources.getDrawable(R.id.icon)).setContent(ContactActivity);
		//Add tabs
		
		
		

	}

}
