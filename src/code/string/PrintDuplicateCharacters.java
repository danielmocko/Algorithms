package code.string;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		String name = "Yokohama";
		
		
	
		System.out.println(	firstExample(name));
		System.out.println(secondExample(name));
	}
	
	public static String firstExample(String name) {
		String newName ="";
		for(int i = 0; i < name.length();i++) {
				if(!newName.contains(String.valueOf(name.charAt(i)))) {
					newName=newName+name.charAt(i);
				}
		}
		return newName;
	}
	
	public static String secondExample(String name) {
		char [] c = name.toCharArray();
		String newName= "";
		for(char n : c){
			if(newName.indexOf(n)== -1) {
				newName += n;
			}
		}
		return newName;
		
	}
}
