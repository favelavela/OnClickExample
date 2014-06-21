package com.example.onclickexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b1,b2;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);

		b1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Toast msg = Toast.makeText(getBaseContext(),
						"Click en el boton 1", Toast.LENGTH_LONG);
				msg.show();
			}
		});

	}
	
	public void mensaje2(View v)
	{
		Toast msg = Toast.makeText(getBaseContext(),
				"Click en el boton 2", Toast.LENGTH_LONG);
		msg.show();
	}
}
