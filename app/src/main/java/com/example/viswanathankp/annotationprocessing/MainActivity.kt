package com.example.viswanathankp.annotationprocessing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.binder.Binding
import com.example.binder_annotations.BindView
import com.example.binder_annotations.OnClick

class MainActivity : AppCompatActivity() {

    @BindView(R.id.text)
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Binding.bind(this)
    }

    @OnClick(R.id.btn1)
    fun bt1Click(v: View) {
        textView.setText("Button 1 Clicked")
    }
}
