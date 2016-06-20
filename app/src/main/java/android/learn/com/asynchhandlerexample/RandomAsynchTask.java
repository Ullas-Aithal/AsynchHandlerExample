package android.learn.com.asynchhandlerexample;

import android.os.AsyncTask;

/**
 * Created by goodbytes on 6/20/2016.
 */
public class RandomAsynchTask extends AsyncTask<String, String, String> {

    private ResultHandler handler;

    public RandomAsynchTask(ResultHandler handlerFromMainActivity){
        handler = handlerFromMainActivity;
    }

    @Override
    protected String doInBackground(String... params) {
        String resultFromTheNet = "This came from somewhere far far away";
        return resultFromTheNet;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        handler.onResponseReceived(s);
    }
}
