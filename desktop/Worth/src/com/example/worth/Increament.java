package com.example.worth;


import android.support.v4.app.Fragment;
import android.app.Activity;
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

public class Increament extends Activity implements OnClickListener {
	private static final String toString = null;
	int value;
	
        Button btnincreament,btndecreament;
        TextView tvresult,tventernumber;
        EditText etnumber;
        Integer increment = 0;
        

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_increament);
		
		btnincreament=(Button) findViewById(R.id.btnincreament);
		btndecreament=(Button) findViewById(R.id.btndecreament);
		
		tvresult=(TextView) findViewById(R.id.tvresult);
		tventernumber=(TextView) findViewById(R.id.tventernumber);
		
		etnumber=(EditText) findViewById(R.id.etnumber);
		
		
       btnincreament.setOnClickListener(this);
       btndecreament.setOnClickListener(this);
	}



	@Override
	public void onClick(View v) {
		
		int value=0;
		switch (v.getId()) {
		case R.id.btnincreament:
			value = Integer.parseInt(etnumber.getText().toString());
			value++;
			
			
			
			
			
			
			tvresult.setText(toString.valueOf(increment));
			
			
			
			break;
		case R.id.btndecreament:
			 value = Integer.parseInt(etnumber.getText().toString());
			value--;
			tvresult.setText(toString.valueOf(value));

		default:
			break;
		}
	}
}



