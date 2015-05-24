package com.listview.ccdevs.codes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.listview.ccdevs.R;

public class ResActivityDos extends AppCompatActivity {
		private WebView mWebView;

		@Override
		public void onCreate(Bundle icicle) {
		    super.onCreate(icicle);
		    
		    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
		            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		    setContentView(R.layout.activity_res_dos);

		    mWebView = (WebView) findViewById(R.id.webview);
		    WebSettings webSettings = mWebView.getSettings();
	        webSettings.setBuiltInZoomControls(true);
		 			mWebView.loadUrl("file:///android_asset/res_dos.html");
		 		
		 		mWebView.requestFocus();

		     }
			 
		}
