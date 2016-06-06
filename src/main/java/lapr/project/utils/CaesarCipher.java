/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.util.Random;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class CaesarCipher {
 
    static String caesar(String value) {
        
        Random gerador = new Random();
 
        int shift = gerador.nextInt(10);
        
	// Convert to char array.
	char[] buffer = value.toCharArray();

	// Loop over characters.
	for (int i = 0; i < buffer.length; i++) {

	    // Shift letter, moving back or forward 26 places if needed.
	    char letter = buffer[i];
	    letter = (char) (letter + shift);
	    if (letter > 'z') {
		letter = (char) (letter - 26);
	    } else if (letter < 'a') {
		letter = (char) (letter + 26);
	    }
	    buffer[i] = letter;
	}
	// Return final string.
	return new String(buffer);
    }
    
}
