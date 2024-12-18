// Generated by view binder compiler. Do not edit!
package com.example.bitesandtales.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.denzcoskun.imageslider.ImageSlider;
import com.example.bitesandtales.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageSlider imageSlider;

  @NonNull
  public final RecyclerView popularRecyclerView;

  @NonNull
  public final TextView popularTV;

  @NonNull
  public final TextView viewMenuTV;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardView,
      @NonNull ImageSlider imageSlider, @NonNull RecyclerView popularRecyclerView,
      @NonNull TextView popularTV, @NonNull TextView viewMenuTV) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imageSlider = imageSlider;
    this.popularRecyclerView = popularRecyclerView;
    this.popularTV = popularTV;
    this.viewMenuTV = viewMenuTV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.image_slider;
      ImageSlider imageSlider = ViewBindings.findChildViewById(rootView, id);
      if (imageSlider == null) {
        break missingId;
      }

      id = R.id.popularRecyclerView;
      RecyclerView popularRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (popularRecyclerView == null) {
        break missingId;
      }

      id = R.id.popularTV;
      TextView popularTV = ViewBindings.findChildViewById(rootView, id);
      if (popularTV == null) {
        break missingId;
      }

      id = R.id.viewMenuTV;
      TextView viewMenuTV = ViewBindings.findChildViewById(rootView, id);
      if (viewMenuTV == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, cardView, imageSlider,
          popularRecyclerView, popularTV, viewMenuTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}