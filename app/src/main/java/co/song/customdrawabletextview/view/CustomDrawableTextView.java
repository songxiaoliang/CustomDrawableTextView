package co.song.customdrawabletextview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import co.song.customdrawabletextview.R;

/**
 * version :1.0.0
 * Created by Song on 2016/5/10.
 * Blog:http://blog.csdn.net/u013718120
 */
public class CustomDrawableTextView extends TextView{

    //image width、height
    private int imageWidth;
    private int imageHeight;

    private Drawable leftImage;
    private Drawable topImage;
    private Drawable rightImage;
    private Drawable bottomImage;

    public CustomDrawableTextView(Context context) {
        this(context, null);
    }
    public CustomDrawableTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public CustomDrawableTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray ta = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CustomDrawableTextView,0,0);
        int countNum = ta.getIndexCount();
        for (int i = 0; i < countNum; i++) {

            int attr = ta.getIndex(i);
            if (attr == R.styleable.CustomDrawableTextView_leftImage) {
                leftImage = ta.getDrawable(attr);
            } else if (attr == R.styleable.CustomDrawableTextView_topImage) {
                topImage = ta.getDrawable(attr);
            } else if (attr == R.styleable.CustomDrawableTextView_rightImage) {
                rightImage = ta.getDrawable(attr);
            } else if (attr == R.styleable.CustomDrawableTextView_bottomImage) {
                bottomImage = ta.getDrawable(attr);
            } else if (attr == R.styleable.CustomDrawableTextView_imageWidth) {
                imageWidth = ta.getDimensionPixelSize(attr, (int) TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics()));
            } else if (attr == R.styleable.CustomDrawableTextView_imageHeight) {
                imageHeight = ta.getDimensionPixelSize(attr, (int) TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics()));
            }
        }

        ta.recycle();
        init();
    }

    /**
     * init views
     */
    private void init() {
        setCompoundDrawablesWithIntrinsicBounds(leftImage,topImage,rightImage,bottomImage);
    }

    @Override
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable left, Drawable top, Drawable right, Drawable bottom) {

        if(left != null) {
            left.setBounds(0,0,imageWidth,imageHeight);
        }

        if(top != null) {
            top.setBounds(0,0,imageWidth,imageHeight);
        }

        if(right != null) {
            right.setBounds(0,0,imageWidth,imageHeight);
        }

        if(bottom != null) {
            bottom.setBounds(0,0,imageWidth,imageHeight);
        }

        setCompoundDrawables(left,top,right,bottom);
    }
}
