package app.healthyme.com.healthyme.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import app.healthyme.com.healthyme.R;

public class intoFirstFragment extends Fragment {

    View view;
    TextView textView1,textView2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.intro_first_fragment, container, false);

      //  textView1=(TextView)view.findViewById(R.id.notificationAlertsTextView);
      //  textView2=(TextView)view.findViewById(R.id.notificationAlertsSubTitleTextView);




        return view;
    }
}
