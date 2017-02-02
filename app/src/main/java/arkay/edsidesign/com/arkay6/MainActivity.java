package arkay.edsidesign.com.arkay6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String logtag = "Arkay6App";  //for use as the tag when logging

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // http://blog.idleworx.com/2011/06/build-simple-android-app-2-button.html
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(startListener); // Register the onClick listener with the implementation above

        /*
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(), "Ouch", Toast.LENGTH_LONG);
                myToast.show();
            }
        });
        */
    }

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener startListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d(logtag,"onClick() called - start button");
            Toast.makeText(MainActivity.this, "The Start button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended - start button");
        }
    };

    // and now for something completely different...
    // http://stackoverflow.com/questions/23768473/android-listener-for-incoming-udp-messages



}
