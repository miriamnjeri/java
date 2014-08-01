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
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class Welcome extends ActionBarActivity implements OnClickListener   {
	Button btnlogin,btnregister;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		btnlogin=(Button) findViewById(R.id.btnlogin);
		btnregister=(Button) findViewById(R.id.btnregister);
		
		btnlogin.setOnClickListener(this);
		btnregister.setOnClickListener(this);
		
		
		
	

		
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnlogin:
			startActivity(new Intent(getApplicationContext(),Login.class));
			Toast.makeText(getApplicationContext(), "this is my Toast message!!! =)",
					   Toast.LENGTH_LONG).show();
			
			break;
		case R.id.btnregister:
			startActivity(new Intent(getApplicationContext(),Register.class));
			Toast.makeText(getApplicationContext(), "please enter your details!!! =)",
					   Toast.LENGTH_LONG).show();

		default:
			break;
		}
		
	}
	

}
