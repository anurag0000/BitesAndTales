// Generated by view binder compiler. Do not edit!
package com.example.bitesandtales.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bitesandtales.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHistoryBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView RecentBuyTV;

  @NonNull
  public final RecyclerView buyAgainRecyclerView;

  @NonNull
  public final CardView orderStatus;

  @NonNull
  public final TextView previouslyBuyTV;

  @NonNull
  public final ConstraintLayout recentBuy;

  @NonNull
  public final CardView recentBuyCardView;

  @NonNull
  public final ImageView recentBuyIV;

  @NonNull
  public final TextView recentBuyPriceTV;

  @NonNull
  public final TextView recentBuyTV;

  private FragmentHistoryBinding(@NonNull FrameLayout rootView, @NonNull TextView RecentBuyTV,
      @NonNull RecyclerView buyAgainRecyclerView, @NonNull CardView orderStatus,
      @NonNull TextView previouslyBuyTV, @NonNull ConstraintLayout recentBuy,
      @NonNull CardView recentBuyCardView, @NonNull ImageView recentBuyIV,
      @NonNull TextView recentBuyPriceTV, @NonNull TextView recentBuyTV) {
    this.rootView = rootView;
    this.RecentBuyTV = RecentBuyTV;
    this.buyAgainRecyclerView = buyAgainRecyclerView;
    this.orderStatus = orderStatus;
    this.previouslyBuyTV = previouslyBuyTV;
    this.recentBuy = recentBuy;
    this.recentBuyCardView = recentBuyCardView;
    this.recentBuyIV = recentBuyIV;
    this.recentBuyPriceTV = recentBuyPriceTV;
    this.recentBuyTV = recentBuyTV;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.RecentBuyTV;
      TextView RecentBuyTV = ViewBindings.findChildViewById(rootView, id);
      if (RecentBuyTV == null) {
        break missingId;
      }

      id = R.id.buyAgainRecyclerView;
      RecyclerView buyAgainRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (buyAgainRecyclerView == null) {
        break missingId;
      }

      id = R.id.orderStatus;
      CardView orderStatus = ViewBindings.findChildViewById(rootView, id);
      if (orderStatus == null) {
        break missingId;
      }

      id = R.id.previouslyBuyTV;
      TextView previouslyBuyTV = ViewBindings.findChildViewById(rootView, id);
      if (previouslyBuyTV == null) {
        break missingId;
      }

      id = R.id.recentBuy;
      ConstraintLayout recentBuy = ViewBindings.findChildViewById(rootView, id);
      if (recentBuy == null) {
        break missingId;
      }

      id = R.id.recentBuyCardView;
      CardView recentBuyCardView = ViewBindings.findChildViewById(rootView, id);
      if (recentBuyCardView == null) {
        break missingId;
      }

      id = R.id.recentBuyIV;
      ImageView recentBuyIV = ViewBindings.findChildViewById(rootView, id);
      if (recentBuyIV == null) {
        break missingId;
      }

      id = R.id.recentBuyPriceTV;
      TextView recentBuyPriceTV = ViewBindings.findChildViewById(rootView, id);
      if (recentBuyPriceTV == null) {
        break missingId;
      }

      id = R.id.recentBuyTV;
      TextView recentBuyTV = ViewBindings.findChildViewById(rootView, id);
      if (recentBuyTV == null) {
        break missingId;
      }

      return new FragmentHistoryBinding((FrameLayout) rootView, RecentBuyTV, buyAgainRecyclerView,
          orderStatus, previouslyBuyTV, recentBuy, recentBuyCardView, recentBuyIV, recentBuyPriceTV,
          recentBuyTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
