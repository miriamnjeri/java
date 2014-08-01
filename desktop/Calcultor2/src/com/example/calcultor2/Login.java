package com.example.calcultor2;

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

public class Login extends ActionBarActivity implements OnClickListener {
	TextView tvemail,tvpassword;
	EditText etpassword,etemail;
	Button btnsubmit,btncancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	tvemail=(TextView) findViewById(R.id.tvemail);
	tvpassword=(TextView) findViewById(R.id.tvpassword);
	
	etpassword=(EditText) findViewById(R.id.etpassword);
	etemail=(EditText) findViewById(R.id.etemail);
	
	btnsubmit=(Button) findViewById(R.id.btnsubmit);
	btncancel=(Button) findViewById(R.id.btncancel);
	
	btnsubmit.setOnClickListener(this);
	btncancel.setOnClickListener(this);
	
	
		

		
		}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnsubmit:
			startActivity(new Intent(getApplicationContext(),HomeScreen.class));
			Toast.makeText(getApplicationContext(), "Welcome to Homescreen screen=)", Toast.LENGTH_LONG).show();
			
			break;
		case R.id.btncancel:
			startActivity(new Intent(getApplicationContext(),Welcome.class));
			Toast.makeText(getApplicationContext(), "We are going to do calculations in this app=)", Toast.LENGTH_LONG).show();
			

		default:
			break;
		}
		
	}
	}


