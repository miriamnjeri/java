package com.example.worth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginForm extends Activity implements OnClickListener {
	private static final boolean isChecked = false;
	TextView tvusername, tvpassword;
	EditText etusername, etpassword;
	CheckBox chkbox;
	Button btntoast, btnback;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_form);
		//initialization
		tvusername=(TextView) findViewById(R.id.tvusername);
		tvpassword=(TextView) findViewById(R.id.tvpassword);
		
		etusername=(EditText) findViewById(R.id.etusername);
		etpassword=(EditText) findViewById(R.id.etpassword);
		
		chkbox=(CheckBox) findViewById(R.id.chkbox);
		
		btntoast=(Button) findViewById(R.id.btntoast);
		btnback=(Button) findViewById(R.id.btnback);
		
		//setting on click listener
		chkbox.setOnClickListener(this);
		btntoast.setOnClickListener(this);
		btnback.setOnClickListener(this);
		
		
		
				
		
		

		
	}

	@Override
	public void onClick(View v) { 
		switch (v.getId()) {
		case R.id.btnback:
			startActivity(new Intent(getApplicationContext(),MainScreen.class));
			
			break;
		case R.id.btntoast:
			String username= "Akirachix";
			String password= "ict2013";
			

		default:
			break;
		}
		// check if both fields are empty
			           
		if (etusername.getText().toString().equals("") && etpassword.getText().toString().equals("")) {
			Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
		}
		//check if user name is empty
		else if(etusername.getText().toString().equals("")){
			Toast.makeText(getApplicationContext(), "msg msg", Toast.LENGTH_SHORT).show();
		}
		else if(etpassword.getText().toString().equals("")){
			showToast("You have to login");
		}
			//validation
			else if( ! etusername.getText().toString().equals("")){
				showToast("I told You have to login!");
			}
				
				else if( ! etpassword.getText().toString().equals("")){
					showToast("You have to login");
			}
		
			
		 

		}
		
		
	

	public void showToast(String text){	
		Toast.makeText(getApplicationContext(), "text", Toast.LENGTH_SHORT).show();
	}

}
