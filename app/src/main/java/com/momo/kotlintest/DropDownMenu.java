package com.momo.kotlintest;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class DropDownMenu extends LinearLayout {
    //顶部菜单布局
    private LinearLayout abMenuView;
    //底部容器 包含内容区域 遮罩区域 菜单弹出区域
    private FrameLayout containerViewFrameLayout;
    //内容区域
    private View contentView;
    //遮罩区域
    private View maskView;
    //菜单弹出区域
    private FrameLayout popupMenuViews;


    //分割线颜色
    private int dividerColor = 0xffccccc;
    //文本选中颜色
    private int textSelectedColor = 0xff900c85;
    //文本未选中颜色
    private  int textUnSelectedColor = 0xff11111;
    //遮罩颜色
    private int maskColor = 0x88888888;
    //菜单背景颜色
    private int menuBackgroundColor = 0x88888888;
    //水平分割线颜色
    private int underlineColor = 0xffcccccc;

    //字体大小
    private int menuTextSize = 14;
    //tab选中菜单
    private int menuSelectedIcon;
    //tab未选中菜单
    private int menuUnSelectedIcon;

    public DropDownMenu(Context context) {
        super(context);
    }

    public DropDownMenu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DropDownMenu(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(VERTICAL);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.dropDownMenu);
        underlineColor = a.getColor(R.styleable.dropDownMenu_underlineColor, underlineColor);
        dividerColor = a.getColor(R.styleable.dropDownMenu_dividerColor, dividerColor);
        textSelectedColor = a.getColor(R.styleable.dropDownMenu_textSelectedColor, textSelectedColor);
        textUnSelectedColor = a.getColor(R.styleable.dropDownMenu_textUnSelectedColor, textUnSelectedColor);
        menuBackgroundColor = a.getColor(R.styleable.dropDownMenu_textUnSelectedColor, menuBackgroundColor);
        maskColor = a.getColor(R.styleable.dropDownMenu_maskColor, maskColor);
        menuTextSize = a.getResourceId(R.styleable.dropDownMenu_menuTextSize, menuTextSize);
        menuSelectedIcon = a.getResourceId(R.styleable.dropDownMenu_menuSelectedIcon, menuSelectedIcon);
        menuUnSelectedIcon = a.getResourceId(R.styleable.dropDownMenu_menuUnSelectedIcon, menuUnSelectedIcon);
    }
}
