package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {


	private static final String tag = "MainActivity";

	public void onCreate(Bundle saveInstanceState) {
		super.onCreate(saveInstanceState);
		
		Log.e(tag, "start onCreate!!");
	}
	
	protected void onStart() {
		super.onStart();
		
		Log.e(tag, "start onStart!!");
	}
	
	protected void onRestart() {
		super.onRestart();
		
		Log.e(tag, "start onRestart!!");
	}	
	
	protected void onResume() {
		super.onResume();
		
		Log.e(tag, "start onResume");
		
	}
	
	protected void onPause() {
		super.onPause();
		
		Log.e(tag, "start onPause!!");
	}
	
    protected void onStop() {
    	super.onStop();
    	
    	Log.e(tag, "start onStop!!");
	}
    
    protected void onDestroy() {
    	super.onDestroy();
    	
    	Log.e(tag, "onDestroy!!");
	}
	
}
