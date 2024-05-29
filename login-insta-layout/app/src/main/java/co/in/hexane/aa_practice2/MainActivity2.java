package co.in.hexane.aa_practice2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

import co.in.hexane.aa_practice2.fragmentbottom.HomeFragment;
import co.in.hexane.aa_practice2.fragmentbottom.NotificationFragment;
import co.in.hexane.aa_practice2.fragmentbottom.SettingFragment;

public class MainActivity2 extends AppCompatActivity {

    TextView textview;

    //fragment bottom Navigation bar
    BottomNavigationView bottomnagvigation;
    HomeFragment homeFragment = new HomeFragment();
    NotificationFragment notificationFragment = new NotificationFragment();
    SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview = findViewById(R.id.textview);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.ark);
        textview.setText(name);


        
        //fragment bottom Navigation bar

        bottomnagvigation = findViewById(R.id.bottomnagvigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,homeFragment).commit();

        //fragment bottom Navigation bar badgenumber
        BadgeDrawable badgeDrawable = bottomnagvigation.getOrCreateBadge(R.id.notification);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(8);

        //fragment select action for bottomnavigation
        bottomnagvigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,homeFragment).commit();
                        return true;
                    case R.id.notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,notificationFragment).commit();
                        return true;
                    case R.id.setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.framlayout,settingFragment).commit();
                        return true;

                }
                return false;
            }
        });



    }
}