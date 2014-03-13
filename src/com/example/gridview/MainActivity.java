package com.example.gridview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {
	private ArrayList<Object> list;
	private GridView gridView ;
	private ArrayList<String> listViewList ;
	private  GridViewAdapter adapter ;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addDate();
		adapter = new GridViewAdapter(this, list, listViewList);
		gridView = (GridView)findViewById(R.id.gridView1);
		gridView.setAdapter(adapter);
		
		
		///
	}

	private void addDate(){
		listViewList = new ArrayList<String>();
		listViewList.add("33333");
		listViewList.add("44444");
		list = new ArrayList<Object>();
		list.add("11111");
		list.add("22222");
		list.add(listViewList);
		list.add("44444");
		list.add("55555");
	}
	

}
