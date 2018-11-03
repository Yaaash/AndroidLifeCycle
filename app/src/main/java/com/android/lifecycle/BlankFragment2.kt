package com.android.lifecycle

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.AttributeSet
import android.util.Log
import android.view.*


class BlankFragment2 : Fragment() {

    override fun onInflate(context: Context?, attrs: AttributeSet?, savedInstanceState: Bundle?) {
        super.onInflate(context, attrs, savedInstanceState)
        Log.d(MainActivity.TAG, "onInflate :: Fragment2")
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(MainActivity.TAG, "onAttach :: Fragment2")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MainActivity.TAG, "onCreate :: Fragment2")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(MainActivity.TAG, "onCreateView :: Fragment2")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(MainActivity.TAG, "onViewCreated :: Fragment2")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(MainActivity.TAG, "onActivityCreated :: Fragment2")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(MainActivity.TAG, "onViewStateRestored :: Fragment2")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity.TAG, "onStart :: Fragment2")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity.TAG, "onResume :: Fragment2")
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        Log.d(MainActivity.TAG, "onCreateOptionsMenu :: Fragment2")
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        Log.d(MainActivity.TAG, "onCreateContextMenu :: Fragment2")
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        super.onPrepareOptionsMenu(menu)
        Log.d(MainActivity.TAG, "onPrepareOptionsMenu :: Fragment2")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity.TAG, "onPause :: Fragment2")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(MainActivity.TAG, "onSaveInstanceState :: Fragment2")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity.TAG, "onStop :: Fragment2")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(MainActivity.TAG, "onDestroyView :: Fragment2")
    }

    override fun onDestroyOptionsMenu() {
        super.onDestroyOptionsMenu()
        Log.d(MainActivity.TAG, "onDestroyOptionsMenu :: Fragment2")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity.TAG, "onDestroy :: Fragment2")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(MainActivity.TAG, "onDetach :: Fragment2")
    }
}
