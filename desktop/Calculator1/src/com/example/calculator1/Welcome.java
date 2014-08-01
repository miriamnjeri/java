package com.example.calculator1;

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
import android.os.Build;

public class Welcome extends ActionBarActivity implements OnClickListener {
	
			//Declaration
			Button btnlogin, btnregister;
			

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		btnlogin=(Button) findViewById(R.id.welcomelogin);
		btnlogin.setOnClickListener(this);
		btnregister=(Button) findViewById(R.id.welcomeregister);
		btnregister.setOnClickListener(this);
		
		
   
	}


	@Override
	public void onClick(View V) {
	  switch (V.getId()) {
	case R.id.welcomelogin:
		startActivity(new Intent(getApplicationContext(),Login.class));
		
		break;
    case R.id.welcomeregister:
    	startActivity(new Intent(getApplicationContext(),Register.class));
    	
    	
		break;


	default:
		break;
	}
	}

}
