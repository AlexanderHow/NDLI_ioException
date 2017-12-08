package com.polytech.nuitdelinfo.iiioexception.NF;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Alexander H on 08/12/2017.
 */

public class CustomImageView extends android.support.v7.widget.AppCompatImageView {


    public CustomImageView(Context context) {
        super(context);
    }

    @Override
    public boolean performClick() {
        return true;
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);
    }


}
