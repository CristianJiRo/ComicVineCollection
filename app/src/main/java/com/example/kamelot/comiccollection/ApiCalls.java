package com.example.kamelot.comiccollection;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

/**
 * Created by Kamelot on 02/01/2017.
 */

public class ApiCalls extends AsyncTask<Void, Void, Void> {

    //URL para la llamada a la API con los episodios (los 100 primeros resultados de momento).
    static final String episodes = "http://comicvine.gamespot.com/api/episodes/?api_key=37953f46b5d8c2f9b10d8cd2d37b0861519a0d3d&format=json";

    private final static String DATE_PATTERN = "yyyy-MM-dd' 'hh:mm:ss";

    public static void getEpisodes(){

    }

    @Override
    protected Void doInBackground(Void... params) {

        try {
            //Obtención del docuemnto JSON
            String JsonEpisodes = HttpUtils.get(episodes);

            //Iniciamos un objeto GSON
            Gson gson = new GsonBuilder().setDateFormat(DATE_PATTERN).disableHtmlEscaping().create();

            //Metemos los datos en el objeto Episode.
            Episode episode = gson.fromJson(JsonEpisodes, Episode.class);



        } catch (IOException e) {
            e.printStackTrace();
        }



        return null;
    }
}
