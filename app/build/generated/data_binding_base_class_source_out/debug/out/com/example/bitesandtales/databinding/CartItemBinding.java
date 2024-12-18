// Generated by view binder compiler. Do not edit!
package com.example.bitesandtales.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitesandtales.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CartItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton addItemButton;

  @NonNull
  public final ImageButton deleteButton;

  @NonNull
  public final TextView foodNameTV;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView priceTV;

  @NonNull
  public final TextView quantityTV;

  @NonNull
  public final AppCompatButton substractItemButton;

  private CartItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton addItemButton, @NonNull ImageButton deleteButton,
      @NonNull TextView foodNameTV, @NonNull ImageView imageView, @NonNull TextView priceTV,
      @NonNull TextView quantityTV, @NonNull AppCompatButton substractItemButton) {
    this.rootView = rootView;
    this.addItemButton = addItemButton;
    this.deleteButton = deleteButton;
    this.foodNameTV = foodNameTV;
    this.imageView = imageView;
    this.priceTV = priceTV;
    this.quantityTV = quantityTV;
    this.substractItemButton = substractItemButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CartItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CartItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.cart_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CartItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addItemButton;
      AppCompatButton addItemButton = ViewBindings.findChildViewById(rootView, id);
      if (addItemButton == null) {
        break missingId;
      }

      id = R.id.deleteButton;
      ImageButton deleteButton = ViewBindings.findChildViewById(rootView, id);
      if (deleteButton == null) {
        break missingId;
      }

      id = R.id.foodNameTV;
      TextView foodNameTV = ViewBindings.findChildViewById(rootView, id);
      if (foodNameTV == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.priceTV;
      TextView priceTV = ViewBindings.findChildViewById(rootView, id);
      if (priceTV == null) {
        break missingId;
      }

      id = R.id.quantityTV;
      TextView quantityTV = ViewBindings.findChildViewById(rootView, id);
      if (quantityTV == null) {
        break missingId;
      }

      id = R.id.substractItemButton;
      AppCompatButton substractItemButton = ViewBindings.findChildViewById(rootView, id);
      if (substractItemButton == null) {
        break missingId;
      }

      return new CartItemBinding((ConstraintLayout) rootView, addItemButton, deleteButton,
          foodNameTV, imageView, priceTV, quantityTV, substractItemButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
