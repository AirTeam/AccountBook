package cn.gd.airteam.accountbook.providers;

import cn.gd.airteam.accountbook.db.DBHelper;
import cn.gd.airteam.accountbook.db.DBInformation;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class UserProvider extends ContentProvider {

	private DBHelper helper;
	private UriMatcher matcher;
	
	@Override
	public boolean onCreate() {
		helper = new DBHelper(this.getContext());
		matcher = new UriMatcher(UriMatcher.NO_MATCH);
		matcher.addURI(DBInformation.AUTHORITY, DBInformation.USER_TABLE_NAME, DBInformation.ALL);
		matcher.addURI(DBInformation.AUTHORITY, DBInformation.USER_TABLE_NAME + "/#", DBInformation.ITEM);
		return true;
	}

	
	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		return 0;
	}

	@Override
	public String getType(Uri uri) {
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		return null;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		return null;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		return 0;
	}

}
