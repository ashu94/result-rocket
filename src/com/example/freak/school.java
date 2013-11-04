package com.example.freak;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.content.Intent;


public class school extends Activity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.school);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		public void CBSE (View view)	{
			goToUrl ("http://cbseresults.nic.in/");
		}
		
		public void ICSE (View view)	{
			goToUrl ("http://www.cisce.in.com");
		}
		
		public void NIOS (View view)	{
			goToUrl ("http://www.nios.ac.in/results.aspx");
		}
		
		public void OTHER (View view)	{
			goToUrl ("http://results.gov.in/academics.aspx");
		}
		
		
		private void goToUrl (String url) {
	        Uri uriUrl = Uri.parse(url);
	        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
	        startActivity(launchBrowser);
	}
}
	
