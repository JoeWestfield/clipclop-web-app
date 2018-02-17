package hk.com.clipclop;

import android.content.Intent;
import android.os.Handler;
import android.os.PersistableBundle;
import android.provider.Telephony;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView ClipClop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClipClop = (WebView)findViewById(R.id.clipclopwebview);
        WebSettings mySettings = ClipClop.getSettings();
        mySettings.setJavaScriptEnabled(true);
        ClipClop.loadUrl("https://www.clipclop.com.hk");
        ClipClop.setWebViewClient(new WebViewClient());

        // test repo

        // test for pull

        // test 03



    }

    @Override
    public void onBackPressed() {
        if (ClipClop.canGoBack()) {
            ClipClop.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
