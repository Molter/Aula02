package br.com.gabrielmolter.aula2;

import java.util.ArrayList;

public class Pessoas {
	private static Pessoas mPessoas;
	
	private ArrayList<Pessoa> mList;
	
	public static Pessoas connect(){
		if(mPessoas == null){
			mPessoas = new Pessoas();
		}
		
		return mPessoas;
	}
	private Pessoas(){
		mList = new ArrayList<Pessoa>();
		
		mList.add(new Pessoa("Joao", "Silva", "Rua dos ladrilhos, 74", "12/05/1997"));
		mList.add(new Pessoa("Jose", "Santos", "Rua dos ladrilhos, 74", "17/12/1982"));
		mList.add(new Pessoa("Maria", "Sauro", "Rua dos ladrilhos, 74", "21/12/1964"));
		mList.add(new Pessoa("Cleber", "Clemente", "Rua dos ladrilhos, 74", "30/01/1984"));
		mList.add(new Pessoa("Inaio", "Antunes", "Rua dos ladrilhos, 74", "03/07/1953"));
		mList.add(new Pessoa("Florisbelo", "Fagundes", "Rua dos ladrilhos, 74", "15/03/1990"));
		mList.add(new Pessoa("Atobiraldo", "Schimitd", "Rua dos ladrilhos, 74", "27/04/1979"));
		mList.add(new Pessoa("Cesar", "Wenceslau JR", "Rua dos ladrilhos, 74", "11/07/2005"));
		mList.add(new Pessoa("Tamara", "da Costa", "Rua dos ladrilhos, 74", "18/08/1970"));
		
		mList.add(new Pessoa("Joao", "Silva", "Rua dos ladrilhos, 74", "12/05/1997"));
		mList.add(new Pessoa("Jose", "Santos", "Rua dos ladrilhos, 74", "17/12/1982"));
		mList.add(new Pessoa("Maria", "Sauro", "Rua dos ladrilhos, 74", "21/12/1964"));
		mList.add(new Pessoa("Cleber", "Clemente", "Rua dos ladrilhos, 74", "30/01/1984"));
		mList.add(new Pessoa("Inaio", "Antunes", "Rua dos ladrilhos, 74", "03/07/1953"));
		mList.add(new Pessoa("Florisbelo", "Fagundes", "Rua dos ladrilhos, 74", "15/03/1990"));
		mList.add(new Pessoa("Atobiraldo", "Schimitd", "Rua dos ladrilhos, 74", "27/04/1979"));
		mList.add(new Pessoa("Cesar", "Wenceslau JR", "Rua dos ladrilhos, 74", "11/07/2005"));
		mList.add(new Pessoa("Tamara", "da Costa", "Rua dos ladrilhos, 74", "18/08/1970"));
		
		mList.add(new Pessoa("Joao", "Silva", "Rua dos ladrilhos, 74", "12/05/1997"));
		mList.add(new Pessoa("Jose", "Santos", "Rua dos ladrilhos, 74", "17/12/1982"));
		mList.add(new Pessoa("Maria", "Sauro", "Rua dos ladrilhos, 74", "21/12/1964"));
		mList.add(new Pessoa("Cleber", "Clemente", "Rua dos ladrilhos, 74", "30/01/1984"));
		mList.add(new Pessoa("Inaio", "Antunes", "Rua dos ladrilhos, 74", "03/07/1953"));
		mList.add(new Pessoa("Florisbelo", "Fagundes", "Rua dos ladrilhos, 74", "15/03/1990"));
		mList.add(new Pessoa("Atobiraldo", "Schimitd", "Rua dos ladrilhos, 74", "27/04/1979"));
		mList.add(new Pessoa("Cesar", "Wenceslau JR", "Rua dos ladrilhos, 74", "11/07/2005"));
		mList.add(new Pessoa("Tamara", "da Costa", "Rua dos ladrilhos, 74", "18/08/1970"));
		
		mList.add(new Pessoa("Joao", "Silva", "Rua dos ladrilhos, 74", "12/05/1997"));
		mList.add(new Pessoa("Jose", "Santos", "Rua dos ladrilhos, 74", "17/12/1982"));
		mList.add(new Pessoa("Maria", "Sauro", "Rua dos ladrilhos, 74", "21/12/1964"));
		mList.add(new Pessoa("Cleber", "Clemente", "Rua dos ladrilhos, 74", "30/01/1984"));
		mList.add(new Pessoa("Inaio", "Antunes", "Rua dos ladrilhos, 74", "03/07/1953"));
		mList.add(new Pessoa("Florisbelo", "Fagundes", "Rua dos ladrilhos, 74", "15/03/1990"));
		mList.add(new Pessoa("Atobiraldo", "Schimitd", "Rua dos ladrilhos, 74", "27/04/1979"));
		mList.add(new Pessoa("Cesar", "Wenceslau JR", "Rua dos ladrilhos, 74", "11/07/2005"));
		mList.add(new Pessoa("Tamara", "da Costa", "Rua dos ladrilhos, 74", "18/08/1970"));
	}
	
	
	public ArrayList<Pessoa> loadAll(){
		return mList;
	}
	
	public Pessoa load(int position){
		return mList.get(position);
	}
	
	public void addPessoa(Pessoa pessoa){
		mList.add(pessoa);
	}
	
	public void removePessoa(int position){
		mList.remove(position);
	}
	
	
}
