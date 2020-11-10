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
	  int smallerSize;
	  SuperArray returnValue = new SuperArray();
	  if(a.size()>b.size()){
		  smallerSize = b.size();
		  for(int i = smallerSize;i<a.size();i++){
			  returnValue.add(a.get(i));
		  }
	  }
	  else{
		  smallerSize = a.size();
		  for(int i = smallerSize;i<b.size();i++){
			  returnValue.add(b.get(i));
		  }
	  }
	  
	  for(int i = smallerSize-1; i>=0;i--){
		  returnValue.add(0,b.get(i));
		  returnValue.add(0,a.get(i));
	  }
	  return returnValue;
	  
  }
  
}
