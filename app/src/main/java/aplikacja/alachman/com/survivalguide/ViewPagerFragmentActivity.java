package aplikacja.alachman.com.survivalguide;

import java.util.List;
import java.util.Vector;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;

public class ViewPagerFragmentActivity extends FragmentActivity{
    /** maintains the pager adapter*/
    private PagerAdapter1 mPagerAdapter;
    /*
    another name, cause a class PagerAdapter already exists
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.viewpager);
        //initialsie the pager
        this.initialisePaging();
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
        //
        ViewPager pager = (ViewPager)super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);
    }


}