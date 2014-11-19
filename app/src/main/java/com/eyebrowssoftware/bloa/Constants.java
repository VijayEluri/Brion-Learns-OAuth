/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.eyebrowssoftware.bloa;

import android.net.Uri;

import com.eyebrowssoftware.bloa.data.UserStatusRecords.UserStatusRecord;
import com.eyebrowssoftware.bloa.data.UserTimelineRecords.UserTimelineRecord;

public class Constants {

    public static final String USER_NAME = "Bloa-user";
    public static final String ACCOUNT_TYPE = "com.eyebrowssoftware.bloa.twitter";
    public static final String AUTHTOKEN_TYPE = "com.eyebrowssoftware.bloa.twitter";

    public static final String VERIFY_URL_STRING = "https://api.twitter.com/1.1/account/verify_credentials.json";
    public static final String PUBLIC_TIMELINE_URL_STRING = "https://api.twitter.com/1.1/statuses/public_timeline.json";
    public static final String USER_TIMELINE_URL_STRING = "https://api.twitter.com/1.1/statuses/user_timeline.json";
    public static final String HOME_TIMELINE_URL_STRING = "https://api.twitter.com/1.1/statuses/home_timeline.json";
    public static final String FRIENDS_TIMELINE_URL_STRING = "https://api.twitter.com/1.1/statuses/friends_timeline.json";
    public static final String STATUSES_URL_STRING = "https://api.twitter.com/1.1/statuses/update.json";

    public static final String USER_TOKEN = "user_token";
    public static final String USER_SECRET = "user_secret";
    public static final String REQUEST_TOKEN = "request_token";
    public static final String REQUEST_SECRET = "request_secret";

    public static final String TWITTER_REQUEST_TOKEN_URL = "https://api.twitter.com/oauth/request_token";
    public static final String TWITTER_ACCESS_TOKEN_URL = "https://api.twitter.com/oauth/access_token";
    public static final String TWITTER_AUTHORIZE_URL = "https://api.twitter.com/oauth/authorize";

    public static final String CALLBACK_URL = "bloa-app://twitt";
    public static final Uri CALLBACK_URI = Uri.parse(CALLBACK_URL);

    public static final int BLOA_LOADER_ID = 1;
    public static final int LIST_LOADER_ID = 2;

    public static final String[] USER_STATUS_PROJECTION = {
        UserStatusRecord.USER_NAME,
        UserStatusRecord.USER_TEXT,
        UserStatusRecord.RECORD_ID,
        UserStatusRecord.USER_CREATED_DATE,
        UserStatusRecord._ID,
        UserStatusRecord.CREATED_DATE
    };

    // Use these so you don't have to look up the columns all the time
    public static final int IDX_USER_STATUS_USER_NAME = 0;
    public static final int IDX_USER_STATUS_USER_TEXT = 1;
    public static final int IDX_USER_STATUS_USER_ID = 2;
    public static final int IDX_USER_STATUS_USER_CREATED_DATE = 3;
    public static final int IDX_USER_STATUS_ID = 4;
    public static final int IDX_USER_STATUS_CREATED_DATE = 5;

    public static final String[] USER_TIMELINE_PROJECTION = {
        UserTimelineRecord.USER_NAME,
        UserTimelineRecord.USER_TEXT,
        UserTimelineRecord.RECORD_ID,
        UserTimelineRecord.USER_CREATED_DATE,
        UserTimelineRecord._ID,
        UserTimelineRecord.CREATED_DATE
    };

    // Use these so you don't have to look up the columns all the time
    public static final int IDX_USER_TIMELINE_USER_NAME = 0;
    public static final int IDX_USER_TIMELINE_USER_TEXT = 1;
    public static final int IDX_USER_TIMELINE_USER_ID = 2;
    public static final int IDX_USER_TIMELINE_USER_CREATED_DATE = 3;
    public static final int IDX_USER_TIMELINE_ID = 4;
    public static final int IDX_USER_TIMELINE_CREATED_DATE = 5;

    public static final int HTTP_REQUEST_TIMEOUT_MS = 30 * 1000;

    public static final String PARAM_CONFIRM_CREDENTIALS = "confirmCredentials";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_USERNAME = "username";
    public static final String PARAM_AUTHTOKEN_TYPE = "authtokenType";

}
