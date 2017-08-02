package yomko.swipetest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

public class FragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button button = (Button) view.findViewById(R.id.momo2);
        final FragmentD fragmentD = (FragmentD) getActivity().getSupportFragmentManager().findFragmentByTag("DDDD");
        if (fragmentD == null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.group1, new FragmentD(), "DDDD").commit();
                }
            });
        }else {
            getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.group1, fragmentD, "DDDD").commit();
        }
        return view;
    }
}
