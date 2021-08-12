package com.assignment.munroamer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//class will retrieve data from a url
public class DownloadUrl {

    public String readUrl(String myUrl) throws IOException
    {
        String data = "";
        //to read the url
        InputStream inputStream = null;
        HttpURLConnection urlConnection = null;

        try {
            URL url  = new URL(myUrl);
            //open the connection
            urlConnection = (HttpURLConnection) url.openConnection();
            //connect
            urlConnection.connect();

            //Read data from URL
            inputStream = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer sb = new StringBuffer();

            //store each line
            String line = "";

            //append it to the string buffer if it is not null
            while ((line = br.readLine()) != null)
            {
                sb.append(line);
            }

            //converting the String buffer to a string and storing it in the data variable
            data = sb.toString();
            //close the buffer
            br.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            inputStream.close();
            urlConnection.disconnect();
        }
        return data;
    }
}
