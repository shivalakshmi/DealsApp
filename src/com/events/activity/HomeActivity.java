package com.events.activity;

import com.events.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void onLoginClicked(View v){
		
		Intent intent = new Intent(HomeActivity.this,Login.class);
		startActivity(intent);
		
	}
	
	
	
}
