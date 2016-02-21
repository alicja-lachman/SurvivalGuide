package aplikacja.alachman.com.survivalguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;


public class StartActivity extends AppCompatActivity {

    private RelativeLayout startLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
//        Toolbar myToolbar = (Toolbar) findViewById(R.id.);
//        setSupportActionBar(myToolbar);

        startLayout = (RelativeLayout)findViewById(R.id.start_layout);
        startLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(StartActivity.this, ViewPagerFragmentActivity.class);
                startActivity(intent);

            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.game_menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        String ktoryElement;
//
//        switch (item.getItemId()) {
//
//            case R.id.item1:
//                ktoryElement = "pierwszy";
//                break;
//            case R.id.item2:
//                ktoryElement = "drugi";
//                break;
//            case R.id.item3:
//                ktoryElement = "trzeci";
//                break;
//            default:
//                ktoryElement = "żaden";
//
//        }
//
//        Toast.makeText(getApplicationContext(), "Element: " + ktoryElement,
//                Toast.LENGTH_LONG).show();
//
//        return true;
//    }
}
