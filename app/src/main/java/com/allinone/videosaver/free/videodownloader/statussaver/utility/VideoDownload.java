package com.allinone.videosaver.free.videodownloader.statussaver.utility;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.allinone.videosaver.free.videodownloader.statussaver.app.App;
import com.allinone.videosaver.free.videodownloader.statussaver.fragments.DashboardFragment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler1;
import com.yxcorp.gifshow.util.CPU;

import com.allinone.videosaver.free.videodownloader.statussaver.model.instagram.ModelEdge;
import com.allinone.videosaver.free.videodownloader.statussaver.model.instagram.ModelEdgeSidecarToChildren;
import com.allinone.videosaver.free.videodownloader.statussaver.model.instagram.ModelResponse;
import com.allinone.videosaver.free.videodownloader.statussaver.model.mitron.ModelMitron;
import com.allinone.videosaver.free.videodownloader.statussaver.model.twitter.TwitterResponse;
import com.allinone.videosaver.free.videodownloader.statussaver.model.CommonModel;
import com.allinone.videosaver.free.videodownloader.statussaver.helper.ServiceHandler;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import cz.msebera.android.httpclient.Header;
import videodownload.com.newmusically.BuildConfig;
import videodownload.com.newmusically.R;

import static com.allinone.videosaver.free.videodownloader.statussaver.helper.ServiceHandler.getmojvideourl;
import static com.allinone.videosaver.free.videodownloader.statussaver.helper.ServiceHandler.getmxvideourl;
import static com.allinone.videosaver.free.videodownloader.statussaver.utility.Utility.USER_AGENT_1;
import static com.allinone.videosaver.free.videodownloader.statussaver.utility.Utility.USER_AGENT_2;
import static com.allinone.videosaver.free.videodownloader.statussaver.utility.Utility.tryagain;
import static com.allinone.videosaver.free.videodownloader.statussaver.utility.Utility.setToast;
import static com.allinone.videosaver.free.videodownloader.statussaver.utility.Utility.tryagain_login;

public class VideoDownload {
    private static final String TAG = "VideoDownload";
    private static volatile VideoDownload _instance;

    public interface MusicallyDelegate {
        void OnFailure(String str);

        void OnSuccess(CommonModel musicallyModel);
    }

    public static VideoDownload Instance() {
        if (_instance == null) {
            synchronized (VideoDownload.class) {
                _instance = new VideoDownload();
            }
        }
        return _instance;
    }

    @SuppressLint({"StaticFieldLeak", "SetJavaScriptEnabled"})
    public void getMusicallyUrl(final String str, final MusicallyDelegate musicallyDelegate) {
        if (musicallyDelegate != null) {
            musicallyDelegate.OnFailure("Please EMail us on appdevbuild@gmail.com for updated source code along with Purchase code.");
        }



    }

}
