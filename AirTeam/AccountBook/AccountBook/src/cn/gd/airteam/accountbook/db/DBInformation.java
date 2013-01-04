package cn.gd.airteam.accountbook.db;

import android.net.Uri;
import android.provider.BaseColumns;

public final class DBInformation implements BaseColumns {
	
	private DBInformation(){}
	
	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE = "accountbooks.db";
	public static final String USER_TABLE_NAME = "users";
	public static final String ISET_TABLE_NAME = "isets";
	public static final String AUTHORITY = "cn.gd.airteam.provider";
	public static final Uri USER_CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + USER_TABLE_NAME + "/");
	public static final Uri ISET_CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + ISET_TABLE_NAME + "/");
	public static final String USER_ALL_CONTENT_TYPE = "vnd.android.cursor.dir/vnd.airteam.users";
	public static final String USER_ITEM_CONTENT_TYPE = "vnd.android.cursor.item/vnd.airteam.users";
	public static final String ISET_ALL_CONTENT_TYPE = "vnd.android.cursor.dir/vnd.airteam.isets";
	public static final String ISET_ITEM_CONTENT_TYPE = "vnd.android.cursor.item/vnd.airteam.isets";
	public static final int ALL = 1;
	public static final int ITEM = 2;
	
}
