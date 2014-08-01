package com.example.worth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends Activity implements OnClickListener {
    EditText etnumber1, etnumber2;
    TextView tvresult;
    Button btnadd, btnback;
    String number1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addition);
		etnumber1=(EditText) findViewById(R.id.etnumber1);
		etnumber2=(EditText) findViewById(R.id.etnumber2);
		
		tvresult=(TextView) findViewById(R.id.tvresult);
		
		btnadd=(Button) findViewById(R.id.btnadd);
		btnback=(Button) findViewById(R.id.btnback);
		btnadd.setOnClickListener(this);
		btnback.setOnClickListener(this);
		
		

		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnadd:
			//string to integer
			String myVal = etnumber1.getText().toString();
			int total = Integer.parseInt(myVal)+Integer.parseInt(myVal);
			
			startActivity(new  Intent(getApplicationContext(),Addition.class));
			
			break;
			case R.id.btnback:
				startActivity(new  Intent(getApplicationContext(),MainScreen.class));

		default:
			break;
		}
		
	}

}
