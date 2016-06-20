package android.learn.com.asynchhandlerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ResultHandler{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeMeAToast(View view){
        new RandomAsynchTask(this).execute();
    }

    @Override
    public void onResponseReceived(String message) {
        Toast toast = Toast.makeText(getApplicationContext(),"message came : "+message,Toast.LENGTH_SHORT);
        toast.show();
    }

}
