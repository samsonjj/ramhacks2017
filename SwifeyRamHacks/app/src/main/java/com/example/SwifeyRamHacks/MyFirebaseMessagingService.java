package com.example.SwifeyRamHacks;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by brandonc on 9/17/2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService{
    private static final String TAG = "FCM Service";
    @Override
        public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());
    }
}
