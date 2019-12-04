package com.jxd.wanttospend;

import android.graphics.Bitmap;

public class OCRStatus {

    //身份证原图像
    private Bitmap bitmap;

    //初始化码
    public static int idType;

    //成功
    public static final int OCR_Success=1;

    //超时
    public static final int OCR_TimeOut=2;

    //初始化失败
    public static final int OCR_Butld_ERR=3;

    //包名不一致
    public static final int OCR_BUTLD_ERR=4;

    //服务密码不正确
    public static final int OCR_PSW_ERR=5;

    //反面
    public static int OCR_EMBLEM=-1;
    //正面
    public static int OCR_Positive=1;
    //无图片字样
    public static int OCR_NONE=0;

    //机构编号
    public static String institutionCode;

    //服务密码
    public static String password;

    //是否显示模式切换按钮
    public static boolean ShowModeChange=false;
    //MattingOfIdcard  正常下不用，引擎内部裁切外部无法调整
    public static boolean MattingOfIdcard=false;
    //CheckCopyOfIdcard 正常下不用，翻拍检测，在结果中获取InfoCollection类中的 .getImageProperty()
    public static boolean CheckCopyOfIdcard=false;
    //开启小图（身份证头像与银行卡卡号其它证件没有）
    public static boolean OpenSmallPicture=true;
    //是否开启返回身份证旋转信息
    public static boolean OpenImageRotateCheck=true;
    //是否保留UI切层
    public static boolean DecodeInRectOfTakeMode=true;
    //是否保存到私有目录
    public static boolean SaveToData=false;

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        OCRStatus.password = password;
    }

    public static String getInstitutionCode() {
        return institutionCode;
    }

    public static void setInstitutionCode(String institutionCode) {
        OCRStatus.institutionCode = institutionCode;
    }


}
