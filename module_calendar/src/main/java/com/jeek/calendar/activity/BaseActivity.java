package com.jeek.calendar.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.umeng.analytics.MobclickAgent;

/**
 * Created by Jimmy on 2016/7/31.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindView();
        initData();
    }



    public void onResume() {
        super.onResume();
        bindData();
        MobclickAgent.onResume(this);
    }
    public void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract void bindView();

    /**
     * 请求动态数据
     */
    protected void initData() {

    }

    /**
     * 绑定静态数据
     */
    protected void bindData() {

    }

    /**
     * 可以理解为向上转型之后，又向下转型
     * @param id
     * @param <VT>
     * @return
     */
    protected <VT extends View> VT searchViewById(int id) {
        VT view = (VT) findViewById(id);
        if (view == null)
            throw new NullPointerException("This resource id is invalid.");
        return view;
    }

}
