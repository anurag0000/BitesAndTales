// Generated by view binder compiler. Do not edit!
package com.example.bitesandtales.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitesandtales.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BuyAgainItemBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton buyAgainButton;

  @NonNull
  public final ConstraintLayout previouslyBuy;

  @NonNull
  public final CardView previouslyBuyCardView;

  @NonNull
  public final ImageView previouslyBuyItemIV;

  @NonNull
  public final TextView previouslyBuyItemPriceTV;

  @NonNull
  public final TextView previouslyBuyItemTV;

  private BuyAgainItemBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton buyAgainButton, @NonNull ConstraintLayout previouslyBuy,
      @NonNull CardView previouslyBuyCardView, @NonNull ImageView previouslyBuyItemIV,
      @NonNull TextView previouslyBuyItemPriceTV, @NonNull TextView previouslyBuyItemTV) {
    this.rootView = rootView;
    this.buyAgainButton = buyAgainButton;
    this.previouslyBuy = previouslyBuy;
    this.previouslyBuyCardView = previouslyBuyCardView;
    this.previouslyBuyItemIV = previouslyBuyItemIV;
    this.previouslyBuyItemPriceTV = previouslyBuyItemPriceTV;
    this.previouslyBuyItemTV = previouslyBuyItemTV;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BuyAgainItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BuyAgainItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.buy_again_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BuyAgainItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buyAgainButton;
      AppCompatButton buyAgainButton = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainButton == null) {
        break missingId;
      }

      id = R.id.previouslyBuy;
      ConstraintLayout previouslyBuy = ViewBindings.findChildViewById(rootView, id);
      if (previouslyBuy == null) {
        break missingId;
      }

      id = R.id.previouslyBuyCardView;
      CardView previouslyBuyCardView = ViewBindings.findChildViewById(rootView, id);
      if (previouslyBuyCardView == null) {
        break missingId;
      }

      id = R.id.previouslyBuyItemIV;
      ImageView previouslyBuyItemIV = ViewBindings.findChildViewById(rootView, id);
      if (previouslyBuyItemIV == null) {
        break missingId;
      }

      id = R.id.previouslyBuyItemPriceTV;
      TextView previouslyBuyItemPriceTV = ViewBindings.findChildViewById(rootView, id);
      if (previouslyBuyItemPriceTV == null) {
        break missingId;
      }

      id = R.id.previouslyBuyItemTV;
      TextView previouslyBuyItemTV = ViewBindings.findChildViewById(rootView, id);
      if (previouslyBuyItemTV == null) {
        break missingId;
      }

      return new BuyAgainItemBinding((ConstraintLayout) rootView, buyAgainButton, previouslyBuy,
          previouslyBuyCardView, previouslyBuyItemIV, previouslyBuyItemPriceTV,
          previouslyBuyItemTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
