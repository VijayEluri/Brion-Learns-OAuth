/*
 * Copyright 2013 - Brion Noble Emde
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.eyebrowssoftware.bloa.activities;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.SimpleCursorAdapter;

import com.eyebrowssoftware.bloa.Constants;
import com.eyebrowssoftware.bloa.R;
import com.eyebrowssoftware.bloa.data.UserTimelineRecords;
import com.eyebrowssoftware.bloa.data.UserTimelineRecords.UserTimelineRecord;

public class UserTimelineFragment extends ListFragment implements LoaderCallbacks<Cursor> {
    static final String TAG = "UserTimelineFragment";

    private static final int[] IDS = {
        android.R.id.text1,
        android.R.id.text2
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.setEmptyText(this.getString(R.string.empty));
        // No cursor yet. Will be assigned when the CursorLoader query is complete
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this.getActivity(),
            android.R.layout.simple_list_item_2, null, Constants.USER_TIMELINE_PROJECTION, IDS, 0);
        setListAdapter(adapter);
        // Set up our cursor loader. It manages the cursors from now on
        getLoaderManager().initLoader(Constants.LIST_LOADER_ID, null, this);
    }

    @Override
    public Loader<Cursor> onCreateLoader(int loaderId, Bundle arguments) {
        return new CursorLoader(getActivity(), UserTimelineRecords.CONTENT_URI,
            Constants.USER_TIMELINE_PROJECTION, null, null,
            UserTimelineRecord.DEFAULT_SORT_ORDER);
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        ((SimpleCursorAdapter) this.getListAdapter()).swapCursor(cursor);
    }

    @Override
    public void onLoaderReset(Loader<Cursor> arg0) {
        ((SimpleCursorAdapter) this.getListAdapter()).swapCursor(null);
    }
}
