/* This is the assignment to use the ACTION_VIEW & ACTION_Dial intent for making phone call and browsing the urls.
 * Author: Amit Kumar Rajoriya
 */



package com.assignment.implicit.implicitintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Get the url from textbox and create an intent for launching it. */
    public void openUrl(View view) {
        EditText urlText = (EditText) findViewById(R.id.urlText);
        String urlPlaceHolder = urlText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlPlaceHolder));
        startActivity(intent);
    }

    /* Get the phone umber from textbox and create an intent for dialing the phone number*/
    public void ringPhone(View view) {
        EditText phoneNumber = (EditText) findViewById(R.id.phoneText);
        String phonePlaceHolder = phoneNumber.getText().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phonePlaceHolder));
        startActivity(intent);
    }

    /* Close the app when click on close button */
    public void close(View v) {
        MainActivity.this.finish();
        System.exit(0);
    }
}