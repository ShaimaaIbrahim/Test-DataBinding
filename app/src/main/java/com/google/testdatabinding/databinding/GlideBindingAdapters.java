package com.google.testdatabinding.databinding;

import android.app.DownloadManager;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.testdatabinding.R;

public class GlideBindingAdapters {

    @BindingAdapter("imageUrl")

    public static void setImageResourse(ImageView imageResourse , int imageUrl){
        Context context=imageResourse.getContext();

        RequestOptions options=new RequestOptions().placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground);

        Glide.with(context).setDefaultRequestOptions(options)
                .load(imageUrl)
                .into(imageResourse);



    }
}
