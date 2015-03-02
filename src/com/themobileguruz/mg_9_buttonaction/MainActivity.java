package com.themobileguruz.mg_9_buttonaction;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnTouchListener {

	Button btntouch;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btntouch=(Button)findViewById(R.id.button1touch);
		
		btntouch.setOnTouchListener(this);
		
		
	}


	@Override
	public boolean onTouch(View arg0, MotionEvent arg1)
	{
		// TODO Auto-generated method stub
		
		switch (arg0.getId()) {
		case R.id.button1touch:
			Toast.makeText(getApplicationContext(), "Button is Touched", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		
		return false;
	}

}
