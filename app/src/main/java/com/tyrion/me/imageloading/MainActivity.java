package com.tyrion.me.imageloading;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.tyrion.me.imageloading.fragment.FrescoFragment;
import com.tyrion.me.imageloading.fragment.GlideFragment;
import com.tyrion.me.imageloading.fragment.PicassoFragment;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout mMainDl;
    private NavigationView mMainNv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mMainDl = (DrawerLayout) findViewById(R.id.main_dl);
        mMainNv = (NavigationView) findViewById(R.id.main_nv);
        mMainNv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()) {
                    case R.id.main_fresco_menu:
                        FrescoFragment frescoFragment = new FrescoFragment();
                        fragmentTransaction.replace(R.id.main_fragment_fl, frescoFragment);
                        break;

                    case R.id.main_picasso_menu:
                        PicassoFragment picassoFragment = new PicassoFragment();
                        fragmentTransaction.replace(R.id.main_fragment_fl, picassoFragment);
                        break;

                    case R.id.main_glide_menu:
                        GlideFragment glideFragment = new GlideFragment();
                        fragmentTransaction.replace(R.id.main_fragment_fl, glideFragment);
                        break;
                }
                fragmentTransaction.commit();
                mMainDl.closeDrawers();
                return false;
            }
        });
    }
}
