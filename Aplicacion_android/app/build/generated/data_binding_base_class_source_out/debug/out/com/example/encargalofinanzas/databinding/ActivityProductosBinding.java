// Generated by view binder compiler. Do not edit!
package com.example.encargalofinanzas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.encargalofinanzas.R;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProductosBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TabLayout tablayoutProductos;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final ViewPager viewpagerProductos;

  private ActivityProductosBinding(@NonNull ConstraintLayout rootView,
      @NonNull TabLayout tablayoutProductos, @NonNull TextView textView2,
      @NonNull ViewPager viewpagerProductos) {
    this.rootView = rootView;
    this.tablayoutProductos = tablayoutProductos;
    this.textView2 = textView2;
    this.viewpagerProductos = viewpagerProductos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProductosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProductosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_productos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProductosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tablayoutProductos;
      TabLayout tablayoutProductos = ViewBindings.findChildViewById(rootView, id);
      if (tablayoutProductos == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.viewpagerProductos;
      ViewPager viewpagerProductos = ViewBindings.findChildViewById(rootView, id);
      if (viewpagerProductos == null) {
        break missingId;
      }

      return new ActivityProductosBinding((ConstraintLayout) rootView, tablayoutProductos,
          textView2, viewpagerProductos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
