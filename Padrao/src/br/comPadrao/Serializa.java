package br.comPadrao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String [] nomes = {"michel","leideson","gomes"};
		
		
		/* Escrita de Objetos */
		
		FileOutputStream fos = new FileOutputStream ("c:/files/objet.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(nomes);
		oos.close();
		
		
		/* Leitura do objeto */
		
		 FileInputStream fis = new FileInputStream ("c:/files/objet.ser");
		 ObjectInputStream ois = new ObjectInputStream (fis);
		 String []nomes1 = (String [])ois.readObject();
		 ois.close ();
		 
		 System.out.println(Arrays.toString(nomes1));
		 
		 
		 
		
		
		
		
		
		
		

	}

}
