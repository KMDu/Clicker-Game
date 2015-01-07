package kevindu.buttonsample;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    RelativeLayout background;
    Button btnGreen, btnBlue;
    ImageButton btnImage;
    EditText income;
    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (RelativeLayout) findViewById(R.id.background);
        btnGreen = (Button) findViewById(R.id.button2);
        btnBlue = (Button) findViewById(R.id.button);
        btnImage = (ImageButton) findViewById(R.id.imageButton);
        income =(EditText) findViewById(R.id.editText);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#5C5C9D"));
            }
        });

        btnImage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                clicks++;
                income.setText("Income: " + clicks);

            }
        });


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
