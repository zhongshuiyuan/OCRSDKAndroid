package com.jxd.wanttospend.utils;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

public class ToastUtils {
        private static String oldMsg;
        protected static Toast toast = null;
        private static long oneTime = 0;
        private static long twoTime = 0;

        public static void showToast(Context context, int resId) {
            showToast(context, context.getString(resId));
        }

        public static void showToast(Context context, int resId, int gravity) {
            showToast(context, context.getString(resId), gravity, 0, 0);
        }

        public static void showToast(Context context, String s, int gravity) {
            showToast(context, s, gravity, 0, 0);
        }

        public static void showToast(Context context, int resId, int gravity, int offX, int offY) {
            showToast(context, context.getString(resId), gravity, offX, offY);
        }

        public static void showToast(Context context, String s) {
            if (toast == null) {
                toast = Toast.makeText(context, null, Toast.LENGTH_SHORT);
                toast.setText(s);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                oneTime = System.currentTimeMillis();
            } else {
                twoTime = System.currentTimeMillis();
                if (s.equals(oldMsg)) {
                    if (twoTime - oneTime > Toast.LENGTH_SHORT) {
                        toast.show();
                    }
                } else {
                    oldMsg = s;
                    toast.setText(s);
                    toast.show();
                }
            }
            oneTime = twoTime;
        }


        public static void showToast(Context context, String s, int gravity, int offX, int offY) {
            if (toast == null) {
                toast = Toast.makeText(context, null, Toast.LENGTH_SHORT);
                toast.setText(s);
                toast.setGravity(gravity, offX, offY);
                toast.show();
                oneTime = System.currentTimeMillis();
            } else {
                twoTime = System.currentTimeMillis();
                if (s.equals(oldMsg)) {
                    if (twoTime - oneTime > Toast.LENGTH_SHORT) {
                        toast.show();
                    }
                } else {
                    oldMsg = s;
                    toast.setText(s);
                    toast.show();
                }
            }
            oneTime = twoTime;
        }

}
