
package com.example.ex091;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;




public class MainActivity extends AppCompatActivity {
    LinearLayout rl;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rl = (LinearLayout) findViewById(R.id.rl);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        String st = item.getTitle().toString();
        if (st.equals("Black")) {
            rl.setBackgroundColor(Color.BLACK);
        } else if (st.equals("Green")) {
            rl.setBackgroundColor(Color.GREEN);
        } else if (st.equals("Yellow")) {
            rl.setBackgroundColor(Color.YELLOW);
        }
        return super.onOptionsItemSelected(item);
    }


    public void oc(View viiew) {
            Intent si = new Intent(this,MainActivity2.class);
            startActivity(si);
    }
}



