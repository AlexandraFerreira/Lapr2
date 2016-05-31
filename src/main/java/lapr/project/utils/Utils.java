/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author AlexandraFerreira 1140388
 */
public class Utils {
    
    public static String mostrarDataFormato_DIA_MES_ANO(Date date) {
        String data;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        data = df.format(date);
        return data;
    }
    
}
