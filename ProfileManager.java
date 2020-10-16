<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/avatar"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="150dp"
        android:background="@drawable/olympique" />
    <TextView
        android:id="@+id/Titre"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sport Manager"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="250dp"/>
    <EditText
        android:id="@+id/name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="entrer le nom du sport"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="350dp"/>
    <TextView
        android:id="@+id/sport"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sport Name"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:layout_centerHorizontal="true"
        android:layout_below="@+id/name"/>
    <EditText
        android:id="@+id/address"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="entrer le code postal"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:layout_marginTop="450dp"/>
    <TextView
        android:id="@+id/sportaddress"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sport Address"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:layout_centerHorizontal="true"
        android:layout_below="@+id/address"/>
    <Button
        android:id="@+id/btmaps"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Open in Google Map"
        
        android:layout_centerHorizontal="true"
        android:layout_marginTop="550dp"/>


</RelativeLayout>
