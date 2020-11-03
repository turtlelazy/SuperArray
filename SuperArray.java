public class SuperArray{
	private String[] data;
	private int size;
	
	public SuperArray(){
		size = 0;
		data = new String[10];
	}
	
	public int size(){
		return size;
	}
	
	public boolean add(String element){
		if(data.length==size){
			resize();
		}
		data[size] = element;
		size++;
		return true;
	}
	
	public String get(int index){
		return data[index];
	}
	
	public String set(int index,String element){
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}
	
	private void resize(){
		String[] cup = data;
		data = new String[size+1];
		for(int i = 0; i <cup.length;i++){
			data[i] = cup[i];
		}
	}
	
	

}