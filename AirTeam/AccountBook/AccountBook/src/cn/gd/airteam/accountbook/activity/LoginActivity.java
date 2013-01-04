package cn.gd.airteam.accountbook.activity;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import cn.gd.airteam.accountbook.R;

public class LoginActivity extends Activity {
	
	private EditText username;
	private EditText password;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }
    
    public void doClick(View target){
    	switch(target.getId()){
    	case R.id.login:
    		Intent i = new Intent(this, FunctionMainActivity.class);
    		startActivity(i);
    		finish();
    		break;
    	case R.id.reset:
    		username.setText("");
    		password.setText("");
    		break;
    	}
    }

    @Override
    public void onBackPressed() {
    	Builder exitDialog = new Builder(this);
    	exitDialog.setTitle("退出提示");
    	exitDialog.setMessage("确定退出？");
    	exitDialog.setPositiveButton("是", new OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				finish();
			}
		});
    	exitDialog.setNegativeButton("否", null);
    	exitDialog.show();
    }
    
}
