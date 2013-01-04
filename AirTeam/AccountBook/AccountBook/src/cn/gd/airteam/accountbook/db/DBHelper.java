package cn.gd.airteam.accountbook.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper{

	public DBHelper(Context context) {
		super(context, DBInformation.DATABASE, null, DBInformation.DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql = "create table " + DBInformation.USER_TABLE_NAME + "(" + UserBean.ID + " integer primary key," + UserBean.USERNAME + " text," + UserBean.PASSWROD + " text," + UserBean.ISETS_ID + " integer);";
		db.execSQL(sql);
		sql = "create table " + DBInformation.ISET_TABLE_NAME + "(" + IsetBean.ID + " integer primary key," + IsetBean.TITLE + " text," + IsetBean.KEY + " text," + IsetBean.VALUE + " text," + IsetBean.REMARKS + " text);";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		String sql = "drop table if exists " + DBInformation.USER_TABLE_NAME;
		db.execSQL(sql);
		sql = "drop table if exists " + DBInformation.ISET_TABLE_NAME;
		db.execSQL(sql);
		onCreate(db);
	}


	
}
