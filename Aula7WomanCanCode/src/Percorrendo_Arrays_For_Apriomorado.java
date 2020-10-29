
public class Percorrendo_Arrays_For_Apriomorado {
	public static void main(String[]args) {
		int[]arrayNum = {87,68,52,5,49,83,45,12,64};
		int somaArray = 0;
		
		for(int i : arrayNum)
			somaArray +=i;
		System.out.printf("Total de elementos arrayNum: %d ", somaArray);
	} 

}
