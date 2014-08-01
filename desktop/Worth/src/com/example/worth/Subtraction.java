package com.example.worth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Subtraction extends Activity implements OnClickListener {
	 EditText etnumber1, etnumber2;
	    TextView tvresult;
	    Button btnsubtract, btnback;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subtraction);
		etnumber1=(EditText) findViewById(R.id.etnumber1);
		etnumber2=(EditText) findViewById(R.id.etnumber2);
		
		tvresult=(TextView) findViewById(R.id.tvresult);
		
		btnsubtract=(Button) findViewById(R.id.btnadd);
		btnback=(Button) findViewById(R.id.btnback);
		btnsubtract.setOnClickListener(this);
		btnback.setOnClickListener(this);
		

	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnsubtract:
			//string to integer
			String myVal = etnumber1.getText().toString();
			int total = Integer.parseInt(myVal)-Integer.parseInt(myVal);
			startActivity(new Intent(getApplicationContext(),Subtraction.class));
			
			break;
		case R.id.btnback:
			startActivity(new  Intent(getApplicationContext(),MainScreen.class));

		default:
			break;
		}
		
		
	}

}
