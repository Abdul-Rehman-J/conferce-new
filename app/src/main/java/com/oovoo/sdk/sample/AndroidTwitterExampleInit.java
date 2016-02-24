package com.oovoo.sdk.sample;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;

import io.fabric.sdk.android.Fabric;


public class AndroidTwitterExampleInit extends Activity {
    private static final String TWITTER_KEY = "QwlxcJyXEkDn7JZZAvIfDgW0u";
    private static final String TWITTER_SECRET = "aQXnTBVDSLlsNaR71Y9PHEm9jUkxyFKePRf9PAYU128g538d9L";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        startLoginActivity();
    }

    private void startLoginActivity() {
        startActivity(new Intent(this,login.class));
    }

}
