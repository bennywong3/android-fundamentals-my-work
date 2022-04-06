package com.example.tabexperiment;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;



public class PagerAdapter extends FragmentStateAdapter {
    int mNumOfTabs;

    public PagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


//    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
//        super(fm);
//
//        this.mNumOfTabs = NumOfTabs;
//    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
//    @Override
//    public Fragment getItem(int position) {
//        switch (position) {
//            case 0: return new TabFragment1();
//            case 1: return new TabFragment2();
//            case 2: return new TabFragment3();
//            default: return null;
//        }
//    }
//
//    /**
//     * Return the number of views available.
//     */
//    @Override
//    public int getCount() {
//        return mNumOfTabs;
//    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new TabFragment1();
            case 1: return new TabFragment2();
            case 2: return new TabFragment3();
            default: return null;
        }
    }

    @Override
    public int getItemCount() {
        return mNumOfTabs;
    }
}