package com.bignerdranch.android.criminalintent;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by peterschwartz on 4/3/16.
 */
public class ZoomedImage extends DialogFragment {
    public static final String EXTRA_IMAGE_PATH = "com.bignerdranch.android.criminal.image_path";

    private ImageView mImageView;

    public static ZoomedImage newInstance(String imagePath) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_IMAGE_PATH, imagePath);

        ZoomedImage fragment = new ZoomedImage();
        fragment.setArguments(args);
        fragment.setStyle(DialogFragment.STYLE_NO_TITLE, 0);

        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mImageView = new ImageView(getActivity());
        String path = (String)getArguments().getSerializable(EXTRA_IMAGE_PATH);
        Bitmap image = PictureUtils.getScaledBitmap(path, getActivity());

        mImageView.setImageBitmap(image);

        return mImageView;
    }
}
