package com.julianasuwandi_212102441.uts_212102441;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private resmiFragment _resmiFragment = new resmiFragment();
    private Context _context;
    private InternalFragment _InternalFragment = new InternalFragment();
    private int _tabCount;

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tebCount)
    {
        super(fragmentManager);
        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position);
        {
            case 0:
                return _resmiFragment;
            case 1:
                return _InternalFragment;
        }
    }

    @Override
    public int getCount() {
        return _tabCount;
    }
}
