package yomko.swipetest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        pagerAdapter.addFragment(new FragmentA());
        pagerAdapter.addFragment(new FragmentB());
        pagerAdapter.addFragment(new FragmentC());

        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_launcher);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_launcher);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_launcher);



    }
}
