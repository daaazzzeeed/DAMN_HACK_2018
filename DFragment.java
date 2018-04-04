package shekhovtsov.nikita.damnhackteam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class DFragment extends Fragment {

    public DFragment() {
        // Required empty public constructor
    }

    public static DFragment newInstance() {
        Bundle args = new Bundle();
        DFragment fragment = new DFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_d, container, false);
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        float rating = 0f;
        RatingBar ratingBar = getActivity().findViewById(R.id.ratingBar_D);
        ratingBar.setRating(rating);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                //handling code goes here
            }
        });
    }

}
