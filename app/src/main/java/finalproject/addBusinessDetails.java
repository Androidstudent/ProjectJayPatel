package finalproject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.lang.String;

import finalproject.R;

public class addBusinessDetails extends Activity {

    private EditText businessNameText;
    private EditText businessCategoryText;
    private EditText contactText;
    private EditText contactNoText;
    private EditText contactEmailText;
    private Button   addDetailsText;

    private SharedPreferences savedSearches; // user's favorite searches
    private ArrayList<String> tags; // list of tags for saved searches
    private ArrayAdapter<String> adapter; // binds tags to ListView


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_business_details);


        businessNameText = (EditText) findViewById(R.id.businessNameText);
        businessCategoryText = (EditText) findViewById(R.id.businessCategoryText);
        contactText = (EditText) findViewById(R.id.contactText);
        contactNoText = (EditText) findViewById(R.id.contactNoText);
        contactEmailText = (EditText) findViewById(R.id.contactEmailText);
        addDetailsText = (Button) findViewById(R.id.addDetailsText);

        addDetailsText.setOnClickListener(btnclick);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.add_business_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener btnclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(addBusinessDetails.this, business_details.class);
         String bname = businessNameText.getText().toString();
           String bcat = businessCategoryText.getText().toString();
            String bcon = contactText.getText().toString();
            String bconno = contactNoText.getText().toString();
            String bcemail = contactEmailText.getText().toString();

            // 2. put key/value data
            intent.putExtra("bnametxt", businessNameText.getText().toString());
            intent.putExtra("bcattxt",businessCategoryText.getText().toString());
            intent.putExtra("bctxt",contactText.getText().toString());
            intent.putExtra("bcnotxt",contactNoText.getText().toString());
            intent.putExtra("bcemailtxt",contactEmailText.getText().toString());


            startActivity(intent);
        }
    };
}

