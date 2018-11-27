import java.util.ArrayList;

public class GithubDayOne{

 public static ArrayList <Integer> combineTwo(ArrayList <Integer> listA, ArrayList <Integer> listB){

	ArrayList <Integer> listC = new ArrayList<>();

	for(int i = 0; i < listA.size(); i ++){
		listC.add(listA.get(i));
	}
		for(int x = 0; x < listB.size(); x ++){
		listC.add(listB.get(x));
	}

	return listC;

}

 public static ArrayList <Integer> withCommas(ArrayList <Integer> listA){
	 ArrayList <Integer> listB = new ArrayList<>();
	 for(int i = 0; i < listA.size(); i ++){
		 listB.add(listA.get(i));
		 System.out.print(",");
	 }
	 return listB;

 }
	public static void main(String [] args){

	ArrayList <Integer> list = new ArrayList <>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

	System.out.print(withCommas(list));









}
}