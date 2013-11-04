package com.example.freak;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;




public class MainActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mai_menu);

	
	
		Button b1=(Button)findViewById(R.id.university);
		Button b2=(Button)findViewById(R.id.school);
		Button b3=(Button)findViewById(R.id.comp);
		


		 b1.setOnClickListener(new View.OnClickListener() {

	            public void onClick(View v) {
	                Intent myintent = new Intent(MainActivity.this,university.class);
	                startActivity(myintent);

	            }
	        });
	          b2.setOnClickListener(new View.OnClickListener() {

	                public void onClick(View v) {
	                    Intent myintent2 = new Intent(MainActivity.this,school.class);
	                    startActivity(myintent2);

	                }
	            }); 
	          b3.setOnClickListener(new View.OnClickListener() {

	                public void onClick(View v) {
	                    Intent myintent2 = new Intent(MainActivity.this,comp.class);
	                    startActivity(myintent2);

	                }
	            });
	         
	          
}
	public void OTHER (View view)	{
		goToUrl ("http://www.indiaresults.com/selectstate.htm");
	}
	
	
	private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
}
	}
	        
