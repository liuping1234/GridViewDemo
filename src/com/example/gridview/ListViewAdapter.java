package com.example.gridview;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter{
	private ArrayList<String> arrayList ;
	private LayoutInflater inflater ;
	private Context context ;

	public ListViewAdapter( Context context,ArrayList<String> arrayList ) {
		this.context = context ;
		this.arrayList = arrayList;
		inflater = LayoutInflater.from(context);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return arrayList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder ;
		if(convertView==null){
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.listitem, null);
			holder.textView = (TextView) convertView.findViewById(R.id.textView2);
			convertView.setTag(holder);
		}else {
		holder =	(ViewHolder) convertView.getTag();
		}
		holder.textView.setText(arrayList.get(position));
		Log.d("tag", (String) holder.textView.getText());
		return convertView;
	}
	

	class ViewHolder {
		TextView textView;
	}

}
