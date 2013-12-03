package br.com.gabrielmolter.aula2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);
		
		long id = getIntent().getExtras().getLong("id");
		
		Pessoas pessoas = Pessoas.connect();
		Pessoa pessoa = pessoas.load((int)id);
		
		TextView nome = (TextView) findViewById(R.id.details_nome);
		nome.setText(pessoa.nome + " " + pessoa.sobrenome);
		
		
		TextView endereco = (TextView) findViewById(R.id.details_endereco);
		endereco.setText(pessoa.endereco);
		
		TextView nascimento = (TextView) findViewById(R.id.details_nascimento);
		nascimento.setText(pessoa.nascimento);
		
	}
}
