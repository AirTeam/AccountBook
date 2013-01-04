package cn.gd.airteam.accountbook.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import cn.gd.airteam.accountbook.R;

public class SplashActivity extends Activity implements Runnable {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		Handler handler = new Handler();
		handler.postDelayed(this, 3000);
	}
	
	public void run() {
		Intent i = new Intent(this,LoginActivity.class);
		startActivity(i);
		finish();
	}

}
