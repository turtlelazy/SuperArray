public class Test{
	public static void main(String[] args){
		SuperArray words = new SuperArray();
		words.add("kani");
		words.add("uni");
		words.add("ebi");
		for(int i = 0; i < words.size(); i++){
		  System.out.println( words.get(i));
		}
		SuperArray test = new SuperArray();
		System.out.println(test.remove(0));
		System.out.println(test.remove(-1));
	}

}