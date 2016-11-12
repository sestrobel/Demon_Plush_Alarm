package com.example.elizabeth.demon_plush_alarm;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.R.attr.button;
import static android.R.attr.state_empty;
import static com.example.elizabeth.demon_plush_alarm.R.id.intro_text;

public class MainActivity extends AppCompatActivity {

    public Button off_Button;
    public Button set_button;
    public TextView confirmation_text;

    public TextView intro_text;
    public EditText hour_Input;
    public EditText min_Input;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        off_Button = (Button) findViewById(R.id.off_Button);
        set_button = (Button) findViewById(R.id.set_button);
        intro_text = (TextView) findViewById(R.id.intro_text);
        confirmation_text = (TextView) findViewById(R.id.confirmation_text);

        hour_Input = (EditText) findViewById(R.id.hour_Input);
        min_Input = (EditText) findViewById(R.id.min_Input);


        set_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (hour_Input.getText().toString() != "" && min_Input.getText().toString() != "")
                    confirmation_text.setText("Alarm set for: " + hour_Input.getText().toString() + min_Input.getText().toString());
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    /*
     // ATTENTION: This was auto-generated to implement the App Indexing API.
     // See https://g.co/AppIndexing/AndroidStudio for more information.

    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }*/

}

