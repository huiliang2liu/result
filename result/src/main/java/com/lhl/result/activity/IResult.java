package com.lhl.result.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/**
 * com.forScreen.util.result
 * 2018/9/27 17:05
 * instructions：
 * author:liuhuiliang  email:825378291@qq.com
 **/
public interface IResult {
    /**
     * 2019/1/8 10:48
     * annotation：有返回结果的启动activity
     * author：liuhuiliang
     * email ：825378291@qq.com
     */
    void startActivityForResult(int requsetCode, Intent intent, ResultCallback... callbacks);

    /**
     * 2019/1/8 10:48
     * annotation：启动activity
     * author：liuhuiliang
     * email ：825378291@qq.com
     */
    void startActivity(Intent intent);

    void startIntentSenderForResult(IntentSender intent, int requestCode, ResultCallback... callbacks) throws IntentSender.SendIntentException;

    void startIntentSenderForResult(IntentSender intent, int requestCode,
                                    Bundle options, ResultCallback... callbacks) throws IntentSender.SendIntentException;

    void startIntentSenderForResult(IntentSender intent, int requestCode,
                                    Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, ResultCallback... callbacks) throws IntentSender.SendIntentException;

    void startIntentSenderForResult(IntentSender intent, int requestCode,
                                    Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags,
                                    Bundle options, ResultCallback... callbacks) throws IntentSender.SendIntentException;
}
