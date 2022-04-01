package com.example.myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:paddingTop="70dp"
android:paddingLeft="30dp"
android:paddingRight="30dp"
android:orientation="vertical"
tools:context=".MainActivity">

<TextView
android:id="@+id/textView3"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:textColor="@color/black"
android:textStyle="bold"
android:text="Enter Number 1" />

<EditText
android:id="@+id/numbox1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:ems="10"
android:inputType="number" />

<TextView
android:id="@+id/textView4"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:textColor="@color/black"
android:textStyle="bold"
android:text="Enter Number 2" />

<EditText
android:id="@+id/numbox2"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:ems="10"
android:inputType="number"
android:minHeight="48dp" />

<TextView
android:id="@+id/textView5"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:textColor="@color/black"
android:textStyle="bold"
android:text="RESULT" />

<TextView
android:id="@+id/resultbox"
android:layout_width="match_parent"
android:layout_height="62dp"
android:textSize="25dp"
/>

<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal">

<Button
android:id="@+id/badd"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20dp"
android:width="75dp"
android:layout_weight="1"
android:text="ADD" />

<Button
android:id="@+id/bsub"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20dp"
android:layout_marginRight="20dp"
android:width="75dp"
android:layout_weight="1"
android:text="SUBTRACT" />

</LinearLayout>

<LinearLayout
android:layout_width="match_parent"
android:layout_height="95dp"
android:orientation="horizontal">

<Button
android:id="@+id/bmul"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20dp"
android:width="75dp"
android:layout_weight="1"
android:text="MULTIPLY" />

<Button
android:id="@+id/bdivide"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:width="75dp"
android:layout_marginLeft="20dp"
android:layout_marginRight="20dp"
android:layout_weight="1"
android:text="DIVIDE" />
</LinearLayout>

</LinearLayout>


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.badd)
        val btn2 = findViewById<Button>(R.id.bsub)
        val btn3 = findViewById<Button>(R.id.bmul)
        val btn4 = findViewById<Button>(R.id.bdivide)
        val tview1 = findViewById<View>(R.id.numbox1) as EditText
        val tview2 = findViewById<View>(R.id.numbox2) as EditText
        val tview3 = findViewById<View>(R.id.resultbox) as TextView
        btn1.setOnClickListener {
            val num1 = Integer.valueOf(tview1.text.toString())
            val num2 = Integer.valueOf(tview2.text.toString())
            val num3 = num1 + num2
            tview3.text = "" + num3
        }
        btn2.setOnClickListener {
            val num1 = Integer.valueOf(tview1.text.toString())
            val num2 = Integer.valueOf(tview2.text.toString())
            val num3 = num1 - num2
            tview3.text = "" + num3
        }
        btn3.setOnClickListener {
            val num1 = Integer.valueOf(tview1.text.toString())
            val num2 = Integer.valueOf(tview2.text.toString())
            val num3 = num1 * num2
            tview3.text = "" + num3
        }
        btn4.setOnClickListener {
            val num1 = java.lang.Float.valueOf(tview1.text.toString())
            val num2 = java.lang.Float.valueOf(tview2.text.toString())
            val num4 = num1 / num2
            tview3.text = "" + num4
        }
    }
}