package com.example.kettellstest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class FinalizeTesting extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finalize_testing);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.finalize_testing, menu);
		return true;
	}

	public void onQuitButtonClick(View view) {
    	finish();
    	System.exit(0);
    }
	
	
}
