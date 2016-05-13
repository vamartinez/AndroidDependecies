package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;

import com.develop.vic.showjokes.StartActivity;
import com.example.victor.myapplication.backend.jokerApi.JokerApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by vic on 13/05/2016.
 */
public class EndpointsAsyncTask extends AsyncTask<Context, Void, String> {
    private JokerApi MyEndpoint = null;
    private Context context;



    public interface AsyncResponse {
        void processFinish(String output);
    }

    public AsyncResponse delegate = null;

    public EndpointsAsyncTask(AsyncResponse delegate){
        this.delegate = delegate;
    }

    @Override
    protected String doInBackground(Context... params) {
        if (MyEndpoint == null) {  // Only do this once


            JokerApi.Builder builder = new JokerApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl("http://10.0.2.2:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> abstractGoogleClientRequest) throws IOException {
                            abstractGoogleClientRequest.setDisableGZipContent(true);
                        }
                    });
            // end options for devappserver

            MyEndpoint = builder.build();
        }

        context = params[0];
        try {
            return MyEndpoint.getJoke().execute().getJoke();
        } catch (IOException e) {
            return e.getMessage();
        }

    }


    @Override
    protected void onPostExecute(String result) {
        delegate.processFinish(result);
    }
}