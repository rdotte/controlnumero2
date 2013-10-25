package com.control2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Button;



public class MainActivity1 extends Activity {
	
	private EditText Editnombre, Editcorreo;
	private RatingBar Ratingbar1;
	private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity1);
    
     Editnombre = (EditText) findViewById(R.id.Editnombre);
     Editcorreo = (EditText) findViewById(R.id.Editcorreo);
     Ratingbar1 = (RatingBar) findViewById(R.id.ratingBar1);
     button = (Button)findViewById(R.id.button);
     
     button.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) {
			
			Intent intent = new Intent (MainActivity1.this, MainActivity2.class);
			intent.putExtra("nombre", Editnombre.getText());
			intent.putExtra("correo", Editcorreo.getText());
			intent.putExtra("rating", Ratingbar1.getRating());
			startActivity(intent);
			
		}
     });
    
    
    
    
    
    
    
    
    
    
    
    }


    
}
