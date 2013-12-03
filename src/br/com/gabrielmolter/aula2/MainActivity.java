package br.com.gabrielmolter.aula2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {

	Context mContext;
	
	OnItemClickListener listener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> adapter, View view, int position,
				long id) {
			Intent intent = new Intent(mContext, DetailsActivity.class);
			intent.putExtra("id", id);
			mContext.startActivity(intent);
			
			Log.i("MainActivity", "clickado id: " + String.valueOf(id));
			
			
		}
		
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = this;

		ListView listview = (ListView) findViewById(R.id.listView);
		ListaAdapter listAdapter = new ListaAdapter(this);

		listview.setAdapter(listAdapter);
		
		
		listview.setOnItemClickListener(listener);
		

	}
}
