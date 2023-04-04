package vertiefendeAufgaben;


//Datei: IntArray.java

public class IntArray
{
private int[] arrayOfInt = null;

// Default-Konstruktor
public IntArray()
{
	   // Es wird ein Array angelegt, das einen int-Wert aufnehmen kann.
    arrayOfInt = new int [1];   
}

// Erweitern der Arraygröße um anzahlElemente Array-Elemente. 
public void expand (int anzahlElemente)
{
	   // aktuelle Array-Größe ermitteln
    int size = arrayOfInt.length;
    // neues größeres Array anlegen 
    int[] tmp = new int [size + anzahlElemente];
    
    // bestehendes zu kleines Array umkopieren 
    for (int i = 0; i < size; i++)
    {
       tmp [i] = arrayOfInt [i];
    }
    arrayOfInt = tmp;
}

public int max()
{   
	int max = Integer.MIN_VALUE;
	
	for (int element : arrayOfInt)
    {
       if (element > max) {
    	   max = element;
       }
    }
	
	return max;
}

public int min()
{   
	int min = Integer.MAX_VALUE;
	
	for (int element : arrayOfInt)
    {
       if (element < min) {
    	   min = element;
       }
    }
	
	return min;
}

// Die Methode put() legt den übergebenen Wert der Variable newValue
// an der Position index im Array ab. Der erste Aufruf erfolgt mit
// dem Indexwert = 0. Es dürfen nur positive int-Werte übergeben werden.
public void put (int index, int newValue)
{
   // Liegt die Position, an die der neue Wert geschrieben werden
   // soll, außerhalb der aktuellen Arraygröße, dann muss dass
   // Array vergrößert werden.
   if (arrayOfInt.length <= index)
      expand (index - arrayOfInt.length + 1);
   arrayOfInt [index] = newValue;
}

// Liefert den Wert an der Array-Postion index oder -1,
// falls der übergebene Index zu groß war.
public int get (int index)
{
   if (arrayOfInt.length > index)
      return arrayOfInt [index];
   // Fehlerfall, der angegebene Index ist zu groß.
   return -1;
}

// Methode darf nur mit Indexwerten >= 0 aufgerufen
// werden.
public void swap (int index1, int index2)
{
   if ((index1 < 0) || (index2 < 0))
      return;
   int size = arrayOfInt.length;
   if ((index1 > size) || (index2 > size))
      return;
   int hilf = arrayOfInt [index1];
   arrayOfInt [index1] = arrayOfInt [index2];
   arrayOfInt [index2] = hilf;        
}

public float average()
{
	int size = arrayOfInt.length;
	int sum = 0;
	
	for (int i = 0; i < size; i++)
    {
       sum += arrayOfInt[i];
    }
	
	int av = sum/size;
	
	return av;
}

public void sort()
{
	int size = arrayOfInt.length;
	
	 for (int i = 0; i < size -1; i++) {
		 for (int j = 1; j < size - i; j++) {
			if(arrayOfInt[j] < arrayOfInt[j-1]) {
				int temp = arrayOfInt[j];
				arrayOfInt[j] = arrayOfInt[j-1];
				arrayOfInt[j-1] = temp;
			}
		}
	}
	// Anmerkung: Zu Beginn des bubblesort-Algorithmus ist die
	// Obergrenze gleich der Arraygröße des zu sortierenden Arrays 
	// Hier der bubblesort-Algorithmus: 
	// while Obergrenze > Index des 2. Feldelementes:
	// Gehe in einer Schleife vom 2. bis zum letzten zu sortie- 
	// renden Array-Element (dessen Array-Index ist um 1 geringer
	// als die Obergrenze). Wenn ein Element kleiner ist als sein
	// Vorgänger, werden beide vertauscht. (Hinweis: Nach dem   
	// ersten Durchlauf steht das größte Element am Ende). Nun
	// wird die Obergrenze um 1 verringert.
}

public void print()
{
   System.out.println ("Ausgabe des Array-Inhaltes: ");
   for (int i = 0; i < arrayOfInt.length; i++)
   {
      System.out.print ('\t' + "Index: " + i + " Wert: "); 
      System.out.println (arrayOfInt [i]);
   }
}
}

