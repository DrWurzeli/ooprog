package aufgabe2;

import java.util.Arrays;

public class MedienArray<T extends Medium> {
	
	private int fuellstand = 0;
	private Medium[] arr = new Medium[10];
	
	public void einfuegen(T ref){
	   arr[fuellstand++] = ref;
	}

	public void ausgeben(){
	   for (int i = 0; i < fuellstand; i++)
	   {
	      System.out.println(arr[i]);
	   }
	}
	
	public void sortieren() {
		Arrays.sort(arr, 0, fuellstand);
	}
}
