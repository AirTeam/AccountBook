package cn.gd.airteam.accountbook.db;

import android.provider.BaseColumns;

public final class UserBean implements BaseColumns {
	
	private UserBean(){}
	
	public static final String ID = "userid";
	public static final String USERNAME = "username";
	public static final String PASSWROD = "password";
	public static final String ISETS_ID = "isetsid"; 
}
