package com.android.lifecycle

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu

class MainActivity : AppCompatActivity() {

    var count = 0
    companion object {
        const val TAG: String = "::LifeCycle::"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceState ?: supportFragmentManager.beginTransaction()
            .add(R.id.frameLayout, BlankFragment())
            .commit()
        Log.d(TAG, "OnCreate")
    }

    fun switch(){
        supportFragmentManager.beginTransaction()
            .add(R.id.frameLayout, BlankFragment2())
            .commit()
    }
    override fun onAttachFragment(fragment: Fragment?) {
        super.onAttachFragment(fragment)
        count ++
        Log.d(TAG, "onAttachFragment $count")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.d(TAG, "onAttachFragment")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        Log.d(TAG, "onPostCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPostResume() {
        super.onPostResume()
        Log.d(TAG, "onPostResume")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d(TAG, "onAttachedToWindow")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.d(TAG, "onCreateOptionsMenu")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        Log.d(TAG, "onPrepareOptionsMenu")
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onUserInteraction() {
        Log.d(TAG, "onUserInteraction")
        super.onUserInteraction()
    }

    override fun onUserLeaveHint() {
        Log.d(TAG, "onUserLeaveHint")
        super.onUserLeaveHint()
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        Log.d(TAG, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Log.d(TAG, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG, "onDestroy")
        super.onDestroy()
    }
}
