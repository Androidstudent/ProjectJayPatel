package finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import finalproject.R;

public class business_details extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_details);

        TextView get1TW = (TextView) findViewById(R.id.get1TW);
        TextView get2TW = (TextView) findViewById(R.id.get2TW);
        TextView get3TW = (TextView) findViewById(R.id.get3TW);
        TextView get4TW = (TextView) findViewById(R.id.get4TW);
        TextView get5TW = (TextView) findViewById(R.id.get5TW);
        Button okbtn =(Button) findViewById(R.id.okbtn);
        okbtn.setOnClickListener(btnclick);

        Intent intent = getIntent();

          String message = intent.getStringExtra("bnametxt");
       String message1 = intent.getStringExtra("bcattxt");
        String message2 = intent.getStringExtra("bctxt");
        String message3 = intent.getStringExtra("bcnotxt");
        String message4 = intent.getStringExtra("bcemailtxt");


        get1TW.setText(intent.getStringExtra("bnametxt"));
       get2TW.setText(message1);
        get3TW.setText(message2);
        get4TW.setText(message3);
        get5TW.setText(message4);
        }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.business_details, menu);
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
        public void onClick(View v)
        {
            Intent myIntent = new Intent(business_details.this, MyActivity.class);
            startActivity(myIntent);
        }
    };
}
