package com.example.calcultor2;

import android.support.v7.app.ActionBarActivity;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class Register extends ActionBarActivity implements OnClickListener {
	Button btnsubmit, btncancel;
	TextView tvfirstname, tvidnumber, tvemail, tvpassword;
	EditText etfirstname, etidnumber, etemail, etpassword;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		btnsubmit=(Button) findViewById(R.id.btnsubmit);
		btncancel=(Button) findViewById(R.id.btncancel);
		
		btnsubmit.setOnClickListener(this);
		btncancel.setOnClickListener(this);
	
		tvfirstname=(TextView) findViewById(R.id.tvfirstname);
		tvidnumber=(TextView) findViewById(R.id.tvidnumber);
		tvemail=(TextView) findViewById(R.id.tvemail);
		tvpassword=(TextView) findViewById(R.id.tvpassword);
		
		etfirstname=(EditText) findViewById(R.id.etfirstname);
		etidnumber=(EditText) findViewById(R.id.etidnumber);
		etemail=(EditText) findViewById(R.id.etemail);
		etpassword=(EditText) findViewById(R.id.etpassword);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnsubmit:
			
			startActivity(new Intent(getApplicationContext(),Login.class));
			Toast.makeText(getApplicationContext(), "The ninja is here =)",
					   Toast.LENGTH_LONG).show();
			
			break;
		case R.id.btncancel:
			startActivity(new Intent(getApplicationContext(),Welcome.class));
			Toast.makeText(getApplicationContext(), "Lets not grow weary in welldoing =)",
					   Toast.LENGTH_LONG).show();


		default:
			break;
		}
		
	}

}
