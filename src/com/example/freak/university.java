package com.example.freak;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;


public class university extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void MTU (View view) {
        goToUrl ( "http://www.mtuams.in/sturoll.aspx");
    }
	public void SHARDA (View view) {
        goToUrl ( "http://results.sharda.ac.in/");
    }
	public void GBTU (View view)	{
		goToUrl ("http://www.uptu.ac.in/results/results_even_12_13.htm");
	}
	
	public void DU (View view)	{
		goToUrl ("http://www.du.ac.in/index.php?id=136");
	}
	
	public void LPU (View view) {
        goToUrl ( "https://ums.lpu.in/");
	}
	
	public void IP (View view)	{
		goToUrl ("http://ggsipuresults.nic.in/ipu//results/resultsmain.htm");
	}
	
	
	public void MDU (View view)	{
		goToUrl ("http://result.mdurohtak.ac.in/");
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