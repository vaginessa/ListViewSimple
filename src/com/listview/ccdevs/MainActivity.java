package com.listview.ccdevs;

import java.util.ArrayList;
import java.util.Arrays;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

  public class MainActivity extends AppCompatActivity {
  
  private ListView mainListView ;
  private ArrayAdapter<String> listAdapter ;
  
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);
    
    // Buscar el recurso ListView.
    mainListView = (ListView) findViewById( R.id.ListView );

    // Crear y rellenar una lista de nombres de planetas.
    String[] planets = new String[] { "Sol","Mercurio", "Venus", "La Tierra", "Marte",
                                      "Júpiter", "Saturno", "Urano", "Neptuno"};  
    ArrayList<String> planetList = new ArrayList<String>();
    planetList.addAll( Arrays.asList(planets) );
    
    // Crear un ArrayAdapter utilizando la lista de planetas.
    listAdapter = new ArrayAdapter<String>(this, R.layout.row_layout, planetList);
    
    // Añadir más planetas. Si pasa un String [] en vez de un List <String>
    // En el constructor ArrayAdapter, no debe añadir más elementos.
    // De lo contrario se producirá una excepción.
    listAdapter.add( "Ceres" );
    listAdapter.add( "Plutón" );
    listAdapter.add( "Haumea" );
    listAdapter.add( "Makemake" );
    listAdapter.add( "Eris" );
    
    // Establecer el ArrayAdapter como adaptador del ListView.
    mainListView.setAdapter( listAdapter ); 
    
   }
    
    @Override
	public boolean onCreateOptionsMenu(Menu menu){
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
		
    }
		
		@Override
		public boolean onOptionsItemSelected(MenuItem item)
		{
			switch (item.getItemId())
			{
				case R.id.action_code:
					startActivity(new Intent(this, CodeActivity.class));
					return true;
				default:
					return super.onOptionsItemSelected(item);
			}
		}
    }


