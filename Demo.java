public class Demo{
  public static void removeDuplicates(SuperArray s){
	  for(int i = 0;i<s.size();i++){
		  if(i!=s.indexOf(s.get(i))){
			  s.remove(i);
			  i--;
		  }
	  }
  }
  
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
	  SuperArray overlapped = new SuperArray();
	  int iterations = 0;
	  for(int i = 0; i < a.size();i++){
		  if(b.indexOf(a.get(i))!=-1){
			  overlapped.add(a.get(i));
		  }
	  }
	  removeDuplicates(overlapped);
	  return overlapped;
  }
  
  public static SuperArray zip(SuperArray a, SuperArray b){
	  int a;
	  String[] leftovers = new String[]
	  SuperArray returnValue = new SuperArray();
	  if(a.size()>b.size()){
		  a = b.size();
		  for(int i = a;i<a.size;i++){
			  returnValue.add(a.get(i));
		  }
	  }
	  else{
		  a = a.size;
		  for(int i = a;i<b.size;i++){
			  returnValue.add(b.get(i));
		  }
	  }
	  
	  for(int i = a.size()-1; i>=0;i--){
		  returnValue.add(b.get(i),0);
		  returnValue.add(a.get(i),0);
	  }
	  
  }
  
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro"); 

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  
	String[] numbersA = {"9","1","2","2","3","4"};
	String[] numbersB = {"0","4","2","2","9"};
	SuperArray numbersAS = new SuperArray();
	SuperArray numbersBS = new SuperArray();
	for(int i = 0;i<numbersA.length;i++){
		numbersAS.add(numbersA[i]);
	}
	
	for(int i = 0;i<numbersB.length;i++){
		numbersBS.add(numbersB[i]);
	}
	
	System.out.println(findOverlap(numbersAS,numbersBS));
	}
}