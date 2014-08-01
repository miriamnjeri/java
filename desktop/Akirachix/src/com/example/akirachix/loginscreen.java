package com.example.akirachix;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class loginscreen extends ActionBarActivity implements OnClickListener {
	Button btnCancel;
	Button btnLogin;
	EditText etEmail;
	EditText etPassword;
	
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.login);
	        btnCancel =(Button) findViewById(R.id.button_Cancel);
	        btnCancel.setOnClickListener(this);
	    	 btnLogin =(Button) findViewById(R.id.button_login);
	    	 btnLogin.setOnClickListener(this);
	    	 etEmail =(EditText) findViewById(R.id.etemail);
	    	 etEmail.setOnClickListener(this);
	    	  etPassword =(EditText) findViewById(R.id.etPassword);
	    	  etPassword.setOnClickListener(this);
	    	 
	    	  
	    	
	        

	        }


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_Cancel:
			
			break;
		case R.id.button_login:
			break;
		case R.id.etemail:
			break;
		case R.id.etPassword:
			break;
				
		default:
			break;
		}
		
		
	}
	    
	
	
	

}
