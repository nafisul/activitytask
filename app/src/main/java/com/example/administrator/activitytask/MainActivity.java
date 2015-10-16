package com.example.administrator.activitytask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText ed;
    Button button;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = (EditText) findViewById(R.id.edittext01);

  Button button =(Button) findViewById(R.id.button01);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String naf = ed.getText().toString();

                String strRev = toReverse(naf);

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);


                intent.putExtra("hjk",strRev);
                intent.putExtra("ghjgjh",1);
                //      intent.putExtra("INT",1);
                startActivity(intent);
            }
        });





    }


    public String toReverse(String string){
        String rev="";
        for(int i=string.length()-1;i>=0;i--){
            rev+=string.charAt(i);
        }
        return rev;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
