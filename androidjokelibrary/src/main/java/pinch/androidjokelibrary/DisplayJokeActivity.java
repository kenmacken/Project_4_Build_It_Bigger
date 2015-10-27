package pinch.androidjokelibrary;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import pinch.mylibrary.R;

/**
 * Created by ken on 25/10/2015.
 */
public class DisplayJokeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        String joke = getIntent().getStringExtra(DisplayJokeFragment.KEY_JOKE);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, DisplayJokeFragment.newInstance(joke), getClass().getSimpleName()).commit();
    }
}


