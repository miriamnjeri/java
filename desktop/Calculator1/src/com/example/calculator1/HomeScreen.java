package com.example.calculator1;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
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
import android.os.Build;

public class HomeScreen extends ActionBarActivity implements OnClickListener {
	
	
	// Declaration
			 TextView tvNo1, tvNo2,tvResult;
			 EditText etNo1, etNo2;
			 Button btnadd, btnsubtract, btndivision, btnmultiplication;
			 String strNo1,strNo2 , srtresults, strans;
			 home Home;
			 
			 double No1=0;
				double No2=0;
				double Result=0;
			 
			

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		
	// initializing
		
		
		
		etNo1=(EditText) findViewById(R.id.etNo1);
		etNo2=(EditText) findViewById(R.id.etNo2);
		btnadd=(Button) findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this);
		btnsubtract=(Button) findViewById(R.id.btnsubtract);
		btnsubtract.setOnClickListener(this);
		btndivision=(Button) findViewById(R.id.btndivision);
		btndivision.setOnClickListener(this);
		btnmultiplication=(Button) findViewById(R.id.btnmultiplication);
		btnmultiplication.setOnClickListener(this);
		tvResult.setText("Answer is:"+Result);
		
		
		Home = new home();
		
		
		
	}
		
		@Override
	public void onClick(View V) {
		switch (V.getId()) {
		case R.id.btnadd:
			//convert string to double
			
			strNo1=etNo1.getText().toString();
			strNo2=etNo2.getText().toString();
			
			
		
			double No1=Double.parseDouble(strNo1);
			double No2=Double.parseDouble(strNo2);
			
			double Result = Home.addition(No1,No2);
			
			//This is the display
			String result = String.valueOf(Result);
			tvResult.setText("The result is" +result);
			
			
			break;
		case R.id.btnsubtract:
		
			strNo1=etNo1.getText().toString();
			strNo2 = etNo2.getText().toString();
			
			
			double NoOne=Double.parseDouble(strNo1);
			double NoTwo=Double.parseDouble(strNo1);
			
			
			String answer = String.valueOf(NoOne);
			tvResult.setText("The result is" +answer);
			
			
		     
			break;
		case R.id.btndivision:
			
			strNo1=etNo1.getText().toString();
			strNo2=etNo2.getText().toString();
			
			
			double numberone=Double.parseDouble(strNo1);
			
			String Answer = String.valueOf(numberone);
			tvResult.setText("The result is" +Answer);
			
			
			
			break;
		case R.id.btnmultiplication:
			strNo1=etNo1.getText().toString();
			strNo2=etNo2.getText().toString();
			
			
			double Numberone=Double.parseDouble(strNo1);
			String Ans = String.valueOf(Numberone);
			tvResult.setText("The result is" +Ans);
			
			
			break;
			
			
			

		default:
			break;
			
			
		}
		
		
		
		
		
		
	}
}