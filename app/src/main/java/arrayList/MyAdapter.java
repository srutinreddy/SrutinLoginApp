package arrayList;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.example.srutinreddy.srutinloginapp.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyAdapter extends BaseAdapter {
ArrayList<String> mList;
    LayoutInflater mInflater;
    public MyAdapter(ArrayList<String>list,LayoutInflater Inflater){
        mList=list;
        mInflater= Inflater;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {

        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= mInflater.inflate(R.layout.activity_my_adapter,null);
        TextView mTv= (TextView)v.findViewById(R.id.id_tv_adapter);
        Button bTn= (Button)v.findViewById(R.id.id_btn_adapter);
        Switch sWh= (Switch)v.findViewById(R.id.id_switch);

        mTv.setText(mList.get(position));
        bTn.setText("button"+(position+1));


        return v;
    }
}
