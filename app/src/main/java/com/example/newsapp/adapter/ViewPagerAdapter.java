package com.example.newsapp.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.newsapp.fragments.HomeFragment;
import com.example.newsapp.fragments.SettingsFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1:
                return new SettingsFragment();
        }

        return new HomeFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
