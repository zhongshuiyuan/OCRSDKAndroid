package com.jxd.wanttospend;

import android.graphics.Bitmap;

import com.jxd.wanttospend.utils.ReturnBean;
import com.turui.engine.InfoCollection;

public interface OCRCallback {
    void ocrSuccess(InfoCollection info);
    void ocrBitmap(Bitmap bitmap);
    void ocrMessage(ReturnBean returnBean);
}
