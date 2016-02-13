package com.yodiks.blowsms;

import com.yodiks.blowsms.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BlowSMS extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smskripto);
        final Button btnKirim = (Button) findViewById(R.id.btnKirim);
        final Button btnBaca = (Button) findViewById(R.id.btnBaca);
        
        btnKirim.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			    Intent intent = new Intent(getBaseContext(), Send.class);
			     startActivity(intent);	
			}
		});
        
        btnBaca.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			    Intent intent = new Intent(getBaseContext(), Inbox.class);
			     startActivity(intent);	
				
			}
		});
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_smskripto, menu);
        return true;
    }
}
/* Yogi Dika Saputra
 * 4812010024 
 * IT3Aeu
 */
