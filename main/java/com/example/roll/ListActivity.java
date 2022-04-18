package com.example.roll;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String[] mZodiacSigns = {"Овен", "Телец", "Близнецы", "Рак", "Лев", "Дева",
            "Весы", "Скорпион", "Стрелец", "Козерог", "Водолей", "Рыбы"};

    private String[] mDates = {"21 марта - 20 апреля", "21 апреля - 20 мая",
            "21 мая - 21 июня", "22 июня - 22 июля", "23 июля - 23 августа",
            "24 августа - 23 сентября", "24 сентября - 23 октября",
            "24 октября - 22 ноября", "23 ноября - 21 декабря",
            "22 декабря - 20 января", "21 января - 20 февраля",
            "21 февраля - 20 марта"};

    int[] mImageIds = {R.drawable.aries, R.drawable.taurus,
            R.drawable.gemini, R.drawable.cancer, R.drawable.lion,
            R.drawable.virgo, R.drawable.libra, R.drawable.scorpio,
            R.drawable.sagittarius, R.drawable.capricorn, R.drawable.aquarius,
            R.drawable.pisces};

    private ZodiacAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ZodiacAdapter(this);
        setListAdapter(mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selection = mAdapter.getString(position);
        Toast.makeText(this, selection, Toast.LENGTH_LONG).show();
    }

    private class ZodiacAdapter extends BaseAdapter {
        private LayoutInflater mLayoutInflater;

        ZodiacAdapter(Context context) {
            mLayoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return mZodiacSigns.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null)
                convertView = mLayoutInflater.inflate(R.layout.list_item, null);

            ImageView image = (ImageView) convertView.findViewById(R.id.image_view_icon);
            image.setImageResource(mImageIds[position]);

            TextView signTextView = (TextView) convertView.findViewById(R.id.text_view_zodiac);
            signTextView.setText(mZodiacSigns[position]);

            TextView dateTextView = (TextView) convertView.findViewById(R.id.text_view_date);
            dateTextView.setText(mDates[position]);

            return convertView;
        }

        String getString(int position) {
            return mZodiacSigns[position] + " (" + mDates[position] + ")";
        }
    }
}