// Generated by view binder compiler. Do not edit!
package com.example.bitesandtales.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitesandtales.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MenuItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView addToCartTV;

  @NonNull
  public final TextView foodNameTV;

  @NonNull
  public final ImageView menuIV;

  @NonNull
  public final TextView priceTV;

  private MenuItemBinding(@NonNull ConstraintLayout rootView, @NonNull TextView addToCartTV,
      @NonNull TextView foodNameTV, @NonNull ImageView menuIV, @NonNull TextView priceTV) {
    this.rootView = rootView;
    this.addToCartTV = addToCartTV;
    this.foodNameTV = foodNameTV;
    this.menuIV = menuIV;
    this.priceTV = priceTV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MenuItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MenuItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.menu_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MenuItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addToCartTV;
      TextView addToCartTV = ViewBindings.findChildViewById(rootView, id);
      if (addToCartTV == null) {
        break missingId;
      }

      id = R.id.foodNameTV;
      TextView foodNameTV = ViewBindings.findChildViewById(rootView, id);
      if (foodNameTV == null) {
        break missingId;
      }

      id = R.id.menuIV;
      ImageView menuIV = ViewBindings.findChildViewById(rootView, id);
      if (menuIV == null) {
        break missingId;
      }

      id = R.id.priceTV;
      TextView priceTV = ViewBindings.findChildViewById(rootView, id);
      if (priceTV == null) {
        break missingId;
      }

      return new MenuItemBinding((ConstraintLayout) rootView, addToCartTV, foodNameTV, menuIV,
          priceTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
