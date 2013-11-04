package com.example.freak;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;


public class comp extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comp);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
		public void UPSC (View view)	{
			goToUrl ("http://www.upsc.gov.in/exams/exams.htm#PageTop");
		}
		
		public void GATE (View view)	{
			goToUrl ("http://gateapp.iitb.ac.in:8080/GATE/");
		}
		
		public void AIEEE (View view)	{
			goToUrl ("http://jeemain.nic.in/jeemain2013/Welcome.aspx");
		}
		
		public void UPSEE (View view)	{
			goToUrl ("http://upresults.nic.in/see2013/gbturesultug.htm");
		}
		
		public void BANK_PO (View view)	{
			goToUrl ("http://www.jagranjosh.com/articles-bank-exams-ibpscwe-results-1328608599-1");
		}


		public void OTHER (View view)	{
			goToUrl ("http://www.resultsout.com/");
		}
		
		private void goToUrl (String url) {
	        Uri uriUrl = Uri.parse(url);
	        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
	        startActivity(launchBrowser);
	}

}
