package com.example.testactionbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.action_refreshs:
			Toast.makeText(this, "Refresh option has been selected", Toast.LENGTH_SHORT).show();
			break;
		case R.id.action_setting:
			Toast.makeText(this, "Setting option has been selected", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		return true;
	}

}
