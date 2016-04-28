/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util.file;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oarcila
 */
public class FileDriver
{
    public static DBObject leerArchivo ( String nomArch)
    {
        String cad_json = "";
        try (BufferedReader br = new BufferedReader(new FileReader(nomArch)))
        {
            String line = null;
            while ((line = br.readLine()) != null)
            {
                cad_json += line;
            }
        } catch (FileNotFoundException ex)
        {
        }catch (IOException ex)
        {
        }
        return (DBObject)JSON.parse(cad_json);
    }
}
