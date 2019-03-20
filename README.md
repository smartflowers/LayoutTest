# LayoutTest
This is second dormitory
# 实验内容
*实现线性布局，相对布局和表格布局相应的设计*
# 主要代码
## 主界面
```
package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    private Button bu_one;
    private Button bu_two;
    private Button bu_three;
    private Intent i=new Intent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bu_one=(Button)findViewById(R.id.bt1);
        bu_two=(Button)findViewById(R.id.bt2);
        bu_three=(Button)findViewById(R.id.bt3);
        bu_one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i.setClass(com.example.myapplication.MainActivity.this,LineLayout.class);
                startActivity(i); }
        });
        bu_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                i.setClass(com.example.myapplication.MainActivity.this,ConstraintLayout.class);
                startActivity(i); }
        });
        bu_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                i.setClass(com.example.myapplication.MainActivity.this,TableLayout.class);
                startActivity(i); }
        });
    }
}

```
## 主界面布局
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/tv1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:layout_marginTop="100dp"
        android:textSize="15dp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
    <Button
        android:id="@+id/bt1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Line"
        android:layout_marginTop="50dp"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toLeftOf="@id/bt2"
        app:layout_constraintTop_toBottomOf="@id/tv1"/>
    <Button
        android:id="@+id/bt2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Constraint"
        android:layout_marginTop="50dp"
        app:layout_constraintLeft_toRightOf="@id/bt1"
        app:layout_constraintRight_toLeftOf="@id/bt3"
        app:layout_constraintTop_toBottomOf="@id/tv1"/>
    <Button
        android:id="@+id/bt3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Table"
        android:layout_marginTop="50dp"
        app:layout_constraintLeft_toRightOf="@id/bt2"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toBottomOf="@id/tv1"/>

</android.support.constraint.ConstraintLayout>
```
## 线性布局
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">
    <LinearLayout
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal">
    <Button
        android:id="@+id/btn_one"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:text="One,One"/>
    <Button
        android:id="@+id/btn_two"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="2"
        android:text="One,Two"/>
    <Button
        android:id="@+id/btn_three"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:text="One,Three"/>
    <Button
        android:id="@+id/btn_four"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:text="One,Four"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:id="@+id/btn_five"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,One"/>
        <Button
            android:id="@+id/btn_six"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="2"
            android:text="Two,Two"/>
        <Button
            android:id="@+id/btn_seven"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,Three"/>
        <Button
            android:id="@+id/btn_eight"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Two,Four"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:id="@+id/btn_nine"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,One"/>
        <Button
            android:id="@+id/btn_ten"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,Two"/>
        <Button
            android:id="@+id/btn_eleven"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,Three"/>
        <Button
            android:id="@+id/btn_twelve"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Three,Four"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:id="@+id/btn_thirteen"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,One"/>
        <Button
            android:id="@+id/btn_fourteen"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="2"
            android:text="Four,Two"/>
        <Button
            android:id="@+id/btn_fifteen"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,Three"/>
        <Button
            android:id="@+id/btn_sixteen"
            android:layout_width="0dp"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:text="Four,Four"/>
    </LinearLayout>
</LinearLayout>
```
## 相对布局
```
<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#000000"
    tools:context=".MainActivity">
    <TextView
        android:id="@+id/tv1"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:background="#FF0000"
        android:gravity="center"
        android:text="RED"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>

    <TextView
        android:id="@+id/tv2"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:background="#FFA500"
        android:gravity="center"
        android:text="ORANGE"
        app:layout_constraintLeft_toRightOf="@+id/tv1"
        app:layout_constraintRight_toLeftOf="@id/tv3"
        app:layout_constraintTop_toTopOf="parent"/>

    <TextView
        android:id="@+id/tv3"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_marginRight="0dp"
        android:background="#FFFF00"
        android:gravity="center"
        android:text="YELLOW"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent"/>

    <TextView
        android:id="@+id/tv4"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_margin="20dp"
        android:background="#008000"
        android:gravity="center"
        android:text="GREEN"


        app:layout_constraintRight_toLeftOf="@+id/tv5"
        app:layout_constraintTop_toBottomOf="@+id/tv1"
        app:layout_constraintBottom_toTopOf="@+id/tv7" />

    <TextView
        android:id="@+id/tv5"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_margin="0dp"
        android:background="#0000FF"
        android:gravity="center"
        android:text="BLUE"

        app:layout_constraintLeft_toRightOf="parent"
        app:layout_constraintRight_toLeftOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/tv2"
        app:layout_constraintBottom_toTopOf="@id/tv7"/>
   <TextView
        android:id="@+id/tv6"
        android:layout_width="100dp"
        android:layout_height="100dp"
        android:layout_margin="20dp"
        android:background="#4B0082"
        android:gravity="center"
        android:text="INDIGO"

        app:layout_constraintLeft_toRightOf="@+id/tv5"

        app:layout_constraintTop_toBottomOf="@+id/tv3"
        app:layout_constraintBottom_toTopOf="@+id/tv7"/>
    <TextView
        android:id="@+id/tv7"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:layout_margin="0dp"
        android:background="#EE82EE"
        android:gravity="center"
        android:text="VIOLET"

        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"
        />
</android.support.constraint.ConstraintLayout>
```
## 表格布局
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:stretchColumns="1"
    >
    <TableRow
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        >
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginLeft="15dp"
            android:textSize="15sp"
            android:text="Open..."
            android:gravity="left"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="15sp"
            android:text="Ctrl-O"
            android:gravity="right" />
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_height="wrap_content"
            android:layout_marginLeft="15dp"
            android:text="Save..."
            android:gravity="left"/>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_height="wrap_content"

            android:text="Ctrl-S"
            android:gravity="right"/>
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_marginLeft="15dp"
            android:layout_height="wrap_content"
            android:text="Save As..."
            android:gravity="left"/>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_height="wrap_content"
            android:text="Ctrl-Shift-S"
            android:gravity="right"/>
    </TableRow>
    <View  android:layout_height="5px"
        android:layout_width="match_parent"
        android:background="#000000"/>
    <TableRow>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_height="wrap_content"
            android:text="X  Import..."
            android:gravity="left"/>
    </TableRow>
    <TableRow>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_height="wrap_content"
            android:text="X  Export..."
            android:gravity="left"/>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_height="wrap_content"
            android:text="Ctrl-E"
            android:gravity="right"/>
    </TableRow>
    <View  android:layout_height="5px"
        android:layout_width="match_parent"
        android:background="#000000"/>
    <TableRow>
        <TextView
            android:layout_width="match_parent"
            android:textSize="15sp"
            android:layout_marginLeft="15dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Quit"
            android:gravity="left"/>
    </TableRow>
</TableLayout>
```
# 实验截图
## 主界面
![line](https://github.com/smartflowers/LayoutTest/blob/master/pictures/Home.jpg)
## 线性布局
![line](https://github.com/smartflowers/LayoutTest/blob/master/pictures/layout_line.jpg)
## 相对布局
![constraint](https://github.com/smartflowers/LayoutTest/blob/master/pictures/layout_constraint.jpg)
## 表格布局
![table](https://github.com/smartflowers/LayoutTest/blob/master/pictures/layout_table.jpg)
