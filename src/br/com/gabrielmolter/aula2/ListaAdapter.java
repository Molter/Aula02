package br.com.gabrielmolter.aula2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListaAdapter extends BaseAdapter{
	
	Pessoas mPessoas;
	Context mContext;
	LayoutInflater mInflater ;
	
	public ListaAdapter(Context context){
		mPessoas = Pessoas.connect();
		mContext = context;
		
		mInflater = (LayoutInflater)
		mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
		//mContext.getSystemService(mContext.LAYOUT_INFLATER_SERVICE);
		
	}
	
	@Override
	public int getCount() {
		return mPessoas.loadAll().size();
	}

	@Override
	public Object getItem(int position) {
		return mPessoas.load(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		
		View layout =
		mInflater.inflate(R.layout.item_lista, null);
		
		Pessoa pessoa = mPessoas.load(position);
		
		TextView nome = (TextView)
				layout.findViewById(R.id.lista_item_nome);
		nome.setText(pessoa.nome);
				
						
		
		TextView sobrenome = (TextView)
				layout.findViewById(R.id.lista_item_sobrenome);
		
		sobrenome.setText(pessoa.sobrenome);
		
		
		return layout;
	}
	
}
