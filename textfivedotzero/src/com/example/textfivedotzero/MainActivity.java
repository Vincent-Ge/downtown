package com.example.textfivedotzero;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends Activity {

	private Context mContext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mContext = MainActivity.this;
		
		 if(savedInstanceState == null){
	        getFragmentManager().beginTransaction().add(R.id.mFrameLayout, new FragmentContent())
	        .commit();
	     }
		
	}
}
