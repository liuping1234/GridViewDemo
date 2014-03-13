package com.example.gridview;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class GridViewAdapter extends BaseAdapter {
	private Context mContext;
	private ArrayList<Object> list;
	private LayoutInflater inflater;
	private ArrayList<String> arrayList;

	public GridViewAdapter(Context context, ArrayList<Object> list, ArrayList<String> arrayList) {
		this.mContext = context;
		this.list = list;
		this.arrayList = arrayList;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.grid_item, null);
			holder.textView = (TextView) convertView
					.findViewById(R.id.textView1);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		if (position == 1) {
			convertView = inflater.inflate(R.layout.list, null);
			ListView listView = (ListView) convertView.findViewById(R.id.listView);
			ListViewAdapter adapter = new ListViewAdapter(mContext, arrayList);
			listView.setAdapter(adapter);
		}else {
			holder.textView.setText(list.get(position).toString());
		}
		Log.d("tag", (String) holder.textView.getText());
		return convertView;
	}

	class ViewHolder {
		TextView textView;
	}

}
