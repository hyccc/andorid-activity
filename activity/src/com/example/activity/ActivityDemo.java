package com.example.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityDemo extends Activity{
	
	private static final String TAG = "ActivityDemo";
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(0);
		
		Log.e(TAG, "start onCreate!!");
	}

	protected void onStart() {
		super.onStart();
		Log.e(TAG, "start onStart!!");
	}
	protected void onRestart() {
		super.onRestart();
		Log.e(TAG, "start onRestart!!");
	}
	protected void onResume() {
		super.onResume();
		Log.e(TAG, "start onResume!!");
	}
	protected void onPause() {
		super.onPause();
		Log.e(TAG, "start onPause!!");
	}
	protected void onStop() {
		super.onStop();
		Log.e(TAG, "start onStop!!");
	}
	protected void onDestroy() {
		super.onDestroy();
		Log.e(TAG, "start onDestory!!");
	}
}