package com.example.materialdesign;

import android.os.Bundle;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FlingAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });


        /*final View img = getActivity().findViewById(R.id.image_view);
        // Setting up a spring animation to animate the view’s translationX property with the final
        // spring position at 0.
        SpringForce springForce = new SpringForce(0)
                .setDampingRatio(0.05f)
                .setStiffness(SpringForce.STIFFNESS_VERY_LOW);
        final SpringAnimation anim = new SpringAnimation(img ,SpringAnimation.TRANSLATION_X).setSpring(springForce);

        anim.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public void onAnimationUpdate(DynamicAnimation animation, float value, float velocity) {

            }
        });
        anim.start();*/
    }

    @Override
    public void onStart() {
        super.onStart();
        /*final View img = getActivity().findViewById(R.id.image_view);
        final SpringAnimation anim;
        anim = new SpringAnimation(img, DynamicAnimation.TRANSLATION_X, 0);
        anim.getSpring().setDampingRatio(SpringForce.DAMPING_RATIO_MEDIUM_BOUNCY)
                .setStiffness(SpringForce.STIFFNESS_VERY_LOW);
        anim.setStartValue(0)
                .setMaxValue(200)
                .setMinValue(-200);
        anim.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public void onAnimationUpdate(DynamicAnimation animation, float value, float velocity) {
                anim.animateToFinalPosition(200);
            }
        });
        anim.start();*/

    }
}