package aufgabe2;

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
}
