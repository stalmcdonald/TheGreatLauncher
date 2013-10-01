package com.cm.thegreatlauncher;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class GreatLauncher extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.launcher);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.launcher, menu);
		return true;
	}
	
	public void showWebPage(View view) {
    	Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("http://sfsailing.com/sailing/index.cfm"));
    	
    	startActivity(intent);
    }
}


	