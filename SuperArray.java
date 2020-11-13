public class SuperArray{
	private String[] data;
	private int size;
	
	public SuperArray(){
		size = 0;
		data = new String[10];
	}
	
	public SuperArray(int initialCapacity){
		if(initialCapacity < 0){
			throw new IllegalArgumentException(initialCapacity + "is negative");
		}
		size = 0;
		data = new String[initialCapacity];
	}
	
	public int size(){
		return size;
	}
	
	public boolean add(String element){
		if(data.length<=size){
			resize();
		}
		data[size] = element;
		size++;
		return true;
	}
	
	
	public void add(int index, String element){
		if(index < 0 || index > size()){
			throw new IndexOutOfBoundsException("Index, " + index +", is out of bounds");
		}
		if(data.length<=size){
			resize();
		}
		for(int i = size;i>index;i--){
			data[i] = data[i-1];
		}
		data[index] = element;
		size++;
	}
	
	public String remove(int index){
		if(index < 0 || index >= size()){
			throw new IndexOutOfBoundsException("Index, " + index +", is out of bounds");
		}
		int sizeV = size;
		String removed = null;
		if(index<size){
			removed = data[index];
			size --;
		}
		else{
			removed = data[-1];
		}
		for(int i = index+1; i < sizeV;i++){
			data[i-1] = data[i];
		}
		return removed;
	}
	
	public String get(int index){
		if(index<0 || index >= size()){
			throw new IndexOutOfBoundsException("Index, " + index +", is out of bounds");
		}
		return data[index];
	}
	
	public String set(int index,String element){
		if(index < 0 || index >= size()){
			throw new IndexOutOfBoundsException("Index, " + index +", is out of bounds");
		}
		String replaced = data[index];
		data[index] = element;
		return replaced;
	}
	
	private void resize(){
		String[] cup = data;
		data = new String[size*2+1];
		for(int i = 0; i <cup.length;i++){
			data[i] = cup[i];
		}
	}
	public boolean isEmpty(){
		return (size == 0);
	}
	
	public void clear(){
		size = 0;
		data = new String[10];
	}
	
	public String toString(){
		String returnString = "[";
		for(int i =0; i <size;i++){
			returnString += data[i];
			if(i!=size-1){
				returnString+= ", ";
			}
		}
		returnString += "]";
		return returnString;
	}
	
	public boolean contains(String s){
		for(int i = 0;i<size;i++){
			if(data[i].equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public int indexOf(String s){
		for(int i = 0; i<size;i++){
			if(data[i].equals(s)){
				return i;
			}
		}
		return -1;
	}
	
	public String[] toArray(){
		String[] returnString = new String[size];
		for(int i = 0; i<size;i++){
			returnString[i]=data[i];
		}
		return returnString;
	}
	
	public int lastIndexOf(String value){
		for(int i = size-1;i>=0;i--){
			if(get(i).equals(value)){
				return i;
			}
		}
		return -1;
	}
	
	public boolean equals(SuperArray a){
		for(int i =0; i < size;i++){
			if(!data[i].equals(a.data[i])){
				return false;
			}
		}
		return (size == a.size);
	}
	
	
	

}