package com.control2;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;

public class MainActivity2 extends Activity {
	
	private TextView Textnombre, Textcorreo;
	private RatingBar resultratingbar;
	String nombre,correo;
	

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity2);
	
	 Textnombre = (TextView) findViewById(R.id.TextNombre);
	 Textcorreo = (TextView) findViewById(R.id.TextCorreo);
	 resultratingbar = (RatingBar)findViewById(R.id.resultratingBar);
	 
	 nombre = getIntent().getStringExtra("nombre");
	 correo = getIntent().getStringExtra("correo");
	 Float rating = getIntent().getFloatExtra("rating", 0);
	 
	 Textnombre.setText(nombre);
	 Textcorreo.setText(correo);
	 resultratingbar.setRating(rating);
	 
	 
	
	
	
	
	
	
	}

	

}
