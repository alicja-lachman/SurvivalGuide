package aplikacja.alachman.com.survivalguide;

import java.util.List;
import java.util.Vector;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ViewPagerFragmentActivity extends FragmentActivity{
    /**
     *  another name, cause a class PagerAdapter already exists
     */
    private static  final String TAG = "ViewPager";
    private PagerAdapter1 mPagerAdapter;
    private Button menuButton;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private String[] mPlanetTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.viewpager);
        this.initialisePaging();


        /**
         * code below opens the drawer menu after clicking the menuButton in every fragment
         * used in ViewPager
         */
        mPlanetTitles = getResources().getStringArray(R.array.planets_array);
        menuButton = (Button)findViewById(R.id.button_menu);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mDrawerList = (ListView)findViewById(R.id.left_drawer);


        mDrawerList.setAdapter(new ArrayAdapter<>(this,
                R.layout.left_drawer, mPlanetTitles));
        // Set the list's click listener
//        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.openDrawer(mDrawerList);
            }
        });
    }

    /**
     * Initialise the fragments to be paged
     */

    private void initialisePaging() {

        List<Fragment> fragments = new Vector<>();
        fragments.add(Fragment.instantiate(this, TabFragment1.class.getName()));
        fragments.add(Fragment.instantiate(this, TabFragment2.class.getName()));
        fragments.add(Fragment.instantiate(this, TabFragment3.class.getName()));
        this.mPagerAdapter  = new PagerAdapter1(super.getSupportFragmentManager(), fragments);

        ViewPager pager = (ViewPager)super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);
    }


}