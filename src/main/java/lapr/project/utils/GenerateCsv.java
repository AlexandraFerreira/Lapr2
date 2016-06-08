/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.io.*;
import java.util.*;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class GenerateCsv {

    /**
     * Método que gera um ficheiro CSV com o nome indicado, a partir dos
     * arraylists passados por parametro
     *
     * @param sFileName nome Ficheiro
     * @param array1 arraylist
     * @param array2 arraylist
     * @param array3 arraylist
     */
    public static void generateCsvFile(String sFileName, ArrayList<String> array1,
            ArrayList<Integer> array2, ArrayList<String> array3) {

        try {
            FileWriter writer = new FileWriter(new File(sFileName + ".csv"));
            int cont = 0;
            writer.append("Keyword");
            writer.append(';');
            writer.append("Total");
            writer.append(';');
            writer.append("Média Recomendacao Global");
            writer.append('\n');

            while (cont < array1.size()) {

                writer.append(array1.get(cont));
                writer.append(';');
                writer.append(array2.get(cont).toString());
                writer.append(";");
                writer.append(array3.get(cont).toString());
                writer.append('\n');
                cont++;
            }

	    //generate whatever data you want
            writer.flush();
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
