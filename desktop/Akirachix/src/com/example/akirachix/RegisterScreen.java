package com.example.akirachix;

import android.R.string;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
	private static final Button Button = null;
	Button btnsubmit;
	Button btncancel;
	EditText etFirstname;
	EditText etsecondname;
	EditText etEmail;
	
	string strFirstname;
	string strSecondname;
	string strPassword;
	
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.Register);
	        //Get Data from the EditText
	        strFirstname=etFirstname.getText().tostring();
	        
	       
	        btnsubmit=(Button) findViewById(R.id.btnsubmit);
	        btnsubmit.setOnClickListener(this);
	        
	       
	        
	        
	        btncancel=(Button) findViewById(R.id.btncancel);
	        btncancel.setOnClickListener(this);
	        
	        etFirstname=(EditText) findViewById(R.id.etFirstname);
	        etFirstname.setOnClickListener(this);
	        
	        etsecondname=(EditText) findViewById(R.id.etsecondname);
	        etsecondname.setOnClickListener(this);
	        
	        etEmail=(EditText) findViewById(R.id.etEmail);
	        etEmail.setOnClickListener(this);
	   
	        
}


	@Override
	public void onClick(View v) {
		switch
		case
		
		Toast.makeText(registerscreen.this, strFirstname, Toast.LENGTH_SHORT).show();
		
				   
		        
	};
		
		 break
		
		
	
		
	}
}
