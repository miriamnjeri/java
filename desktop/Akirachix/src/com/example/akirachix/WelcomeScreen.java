package com.example.akirachix;

import com.example.akirachix.R.id;
import com.example.calculator1.Welcome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeScreen extends ActionBarActivity implements OnClickListener {
	Button btnlogin;
	Button btnRegister;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
         btnlogin =(Button) findViewById(R.id.button_login);
         btnlogin.setOnClickListener((OnClickListener) this);
    	 btnRegister =(Button) findViewById(R.id.button_Register);
    	 btnRegister.setOnClickListener((OnClickListener) this);
    	 
    	
    
        


}



	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button_Login:                                                  
			startActivity(new Intent(getApplicationContext(),Login.class));
			break;
		case R.id.button_Register:
			startActivity(new Intent(getApplicationContext(),Register.class));
			break;

		default:
			break;
		}
		
	}
}
