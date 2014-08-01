package com.example.thegreat;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends Activity implements OnClickListener {
	
	TextView tvnumber1, tvnumber2,tvresult;
	EditText etnumber1,etnumber2;
	Button btnback,btnadd;
	int number1, number2,results,answer;
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addition);
      tvnumber1=(TextView) findViewById(R.id.tvnumber1);
      tvnumber2=(TextView) findViewById(R.id.tvnumber2);
      tvresult=(TextView) findViewById(R.id.tvresult);
      
      etnumber1=(EditText) findViewById(R.id.etnumber1);
      etnumber2=(EditText) findViewById(R.id.etnumber2);
      
      btnback=(Button) findViewById(R.id.btnback);
      btnadd=(Button) findViewById(R.id.btnadd);
      
      btnback.setOnClickListener(this);
      btnadd.setOnClickListener(this);
      
    		  
    	///converting integer to string
      strnumber1= etnumber1.getText().toString();
      strnumber2= etnumber2.getText().toString();
      
      
      
      
		
	}



	@Override
	public void onClick(View V) {
		switch (V.getId()) {
		
		case R.id.add:
			//converting string to integer
			number1=Integer.parseInt(etnumber1.getText().toString());
			number2=Integer.parseInt(etnumber2.getText().toString());
			
			int results=addition (number1 , number2);
			String Results = String.valueOf(results);
			tvresult.setText(Results);
			
			break;
		case R.id.back:
			Toast.makeText(this, "welcome to this screen",Toast.LENGTH_SHORT).show();
			startActivity(new  Intent(getApplicationContext(),Addition.class));

		default:
			break;
		}
		
	}
	public static int addition(int number1, int number2){
		int answer= number1 - number2;
		return answer;
	}
  public int subtraction = number1 - number2;
  


	
	}


