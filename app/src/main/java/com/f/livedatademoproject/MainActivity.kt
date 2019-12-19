package com.f.livedatademoproject

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel = ViewModelProviders.of(this).get(MainViewModel ::class.java)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener{
                viewModel.operationsHere()
            }
        viewModel.observeTextState.observe(this, Observer {
            textView.text = it

        })
    }
}
