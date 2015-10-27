package pinch.androidjokelibrary;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pinch.mylibrary.R;

/**
 * Created by ken on 26/10/2015.
 */
public class DisplayJokeFragment extends Fragment {

    public static final String KEY_JOKE = "JOKE";
    private TextView textViewJoke;
    private String mJoke;

    public DisplayJokeFragment() {}

    public static DisplayJokeFragment newInstance(String joke) {
        DisplayJokeFragment fragment = new DisplayJokeFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY_JOKE, joke);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_joke, container, false);
        textViewJoke = (TextView) view.findViewById(R.id.textView_joke);
        if(getArguments() != null) {
            mJoke = getArguments().getString(KEY_JOKE);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textViewJoke.setText(mJoke);
    }


}
