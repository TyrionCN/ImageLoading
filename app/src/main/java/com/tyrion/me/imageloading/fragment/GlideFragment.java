package com.tyrion.me.imageloading.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.tyrion.me.imageloading.ImageUtils;
import com.tyrion.me.imageloading.R;

/**
 * Created by taomaogan on 2016/12/12.
 */

public class GlideFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_glide, container, false);
        ImageView glideIv = (ImageView) view.findViewById(R.id.glide_iv);
        String internetUrl = "http://i.imgur.com/DvpvklR.png";
        int resourceId = R.drawable.tyrion;
        Glide.with(this)
                .load(resourceId)
//                .centerCrop()
//                .placeholder(R.drawable.tyrion)
//                .crossFade()
                .into(glideIv);
        return view;
    }
}
