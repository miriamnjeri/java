package com.example.calculator1;

import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class Register extends ActionBarActivity implements OnClickListener  {
	EditText etfirstname;
	EditText etIDNo;
	EditText etemail;
	EditText etpassword;
	Button   btnsubtract;
	Button   btncancel;
	TextView tvspinner;
	Spinner spinner1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
		etfirstname=(EditText) findViewById(R.id.etfirstname);
		etIDNo=(EditText) findViewById(R.id.etIDNo);
		etemail=(EditText) findViewById(R.id.etemail);
		etpassword=(EditText) findViewById(R.id.etpassword);
		
		btnsubtract=(Button) findViewById(R.id.btnsubtract);
	    btnsubtract.setOnClickListener(this);
		btncancel=(Button) findViewById(R.id.btncancel);
		btncancel.setOnClickListener(this);
		
		//adding items into spinner
		List<String> list=new ArrayList<String>();
		list.add("kenya");
		list.add("Tanzania");
		list.add("Dubai");
		list.add("South africa");
		list.add("Rwanda");
		list.add("Burundi");
		list.add("Chad");
		list.add("Hangary");
		
		//defines the design of the spinner
		
		ArrayAdapter<String> dataAdapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
		//setting the design of the drop down item
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	}
		
		//getting the value of the selected drop down list
		public void addListenerOnSpinnerItemSelection() {
			
			//Initializing spinner
			spinner1=(Spinner) findViewById(R.id.spinner1);
			spinner1.setOnClickListener(new OnItemSelectedListener() {
				
				
			
				

			});
			
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

	@Override
	public void onClick(View V) {
		switch (V.getId()) {
		case R.id.btncancel:
			startActivity(new Intent(getApplicationContext(),Welcome.class));
			Toast.makeText(getApplicationContext(), "The ninja is here =)",
					   Toast.LENGTH_LONG).show();
			
			break;
		case R.id.btnsubmit:
			startActivity(new Intent(getApplicationContext(),Login.class));
			Toast.makeText(getApplicationContext(), "Lets not grow weary in welldoing =)",
					   Toast.LENGTH_LONG).show();

		default:
			break;
		}
		
	}

}
