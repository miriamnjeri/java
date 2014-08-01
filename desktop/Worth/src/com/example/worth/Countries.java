package com.example.worth;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Countries extends Activity implements OnItemSelectedListener, OnClickListener {
	Spinner spinner1;
	Button btndisplay;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_countries);
		
		addListenerOnSpinnerItemSelection();
		addListenerOnButton();
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		List<String> list = new ArrayList<String>();
		list.add("Kenya");
		list.add("Sudan");
		list.add("Morocco");
		list.add("Libya");
		list.add("Angola");
		list.add("Algeria");
		list.add("Nigeria");
		list.add("Tunisia");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	  }
		
	
	private void addListenerOnButton() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		btndisplay = (Button) findViewById(R.id.btndisplay);
	 
		btndisplay.setOnClickListener(this) ;
		
	}


	public void addListenerOnSpinnerItemSelection() {
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(this);
	  }


	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		
	}
		
	


	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onClick(View v) {
	

	    Toast.makeText(Countries.this,
		"OnClickListener : " + 
                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()) ,0).show();
                
			
						
				  }
		
	}










	










	

