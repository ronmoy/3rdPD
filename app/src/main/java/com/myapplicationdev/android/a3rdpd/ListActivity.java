package com.myapplicationdev.android.a3rdpd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    ListView mListView;

    int[] images = {R.drawable.apple,
            R.drawable.avocado,
            R.drawable.egg,
            R.drawable.chickenbreast,
            R.drawable.asparagus,
            R.drawable.coconut,
            R.drawable.salmon,
            R.drawable.brownrice,
            R.drawable.oats,
            R.drawable.cheese,
            R.drawable.yogurt,};

    String[] names = {"Apple",
    "Avocado",
    "Egg",
    "Chicken Breast",
    "Asparagus",
    "Coconut",
    "Salmon",
    "Brown Rice",
    "Oats",
    "Cheese",
    "Yogurt",};

    String[] description = {"Apples are high in fiber, vitamin C, and numerous antioxidants. They are very filling and make the perfect snack if you find yourself hungry between meals.",
    "Avocados are different than most fruits because they are loaded with healthy fats instead of carbs. Not only are they creamy and tasty but also high in fiber, potassium, and vitamin C.",
    "Eggs are among the most nutritious foods on the planet.",
    "Chicken breast is low in fat and calories but extremely high in protein. It’s a great source of many nutrients.",
    "Asparagus is low in both carbs and calories but loaded with vitamin K.",
    "Coconuts are loaded with fiber and powerful fatty acids called medium-chain triglycerides (MCTs).",
    "Salmon is a type of oily fish that’s incredibly popular due to its excellent taste and high amount of nutrients, including protein and omega-3 fatty acids. It also contains some vitamin D.",
    "Brown rice is fairly nutritious, with a decent amount of fiber, vitamin B1, and magnesium.",
    "Oats are incredibly healthy. They are loaded with nutrients and powerful fibers called beta glucans, which provide numerous benefits.",
    "Cheese is incredibly nutritious, as a single slice may offer about the same amount of nutrients as an entire cup (240 ml) of milk",
    "Yogurt is very high in vitamins, minerals, quality animal protein, and healthy fats, has the added benefit of friendly probiotic bacteria as well."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mListView = (ListView) findViewById(R.id.listView);

        CustomAdaptor customAdaptor = new CustomAdaptor();
        mListView.setAdapter(customAdaptor);
    }

    class CustomAdaptor extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView mImage =(ImageView) view.findViewById(R.id.imageView);
            TextView mTextView1 = (TextView) view.findViewById(R.id.textView);
            TextView mTextView2 = (TextView) view.findViewById(R.id.textView2);

            mImage.setImageResource(images[position]);
            mTextView1.setText(names[position]);
            mTextView2.setText(description[position]);

            return view;
        }
    }

}
