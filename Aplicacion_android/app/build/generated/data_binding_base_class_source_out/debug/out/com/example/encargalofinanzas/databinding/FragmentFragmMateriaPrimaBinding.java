// Generated by view binder compiler. Do not edit!
package com.example.encargalofinanzas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.encargalofinanzas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFragmMateriaPrimaBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnAddProduct;

  @NonNull
  public final ImageButton imageButton4;

  @NonNull
  public final ImageButton imageButton5;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final TableLayout tbllayoutProductoListado;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final EditText txtManoObraNombre;

  @NonNull
  public final EditText txtProductoProyeccion;

  @NonNull
  public final EditText txtProductoProyeccion2;

  private FragmentFragmMateriaPrimaBinding(@NonNull FrameLayout rootView,
      @NonNull Button btnAddProduct, @NonNull ImageButton imageButton4,
      @NonNull ImageButton imageButton5, @NonNull LinearLayout linearLayout,
      @NonNull Spinner spinner, @NonNull TableLayout tbllayoutProductoListado,
      @NonNull TextView textView8, @NonNull EditText txtManoObraNombre,
      @NonNull EditText txtProductoProyeccion, @NonNull EditText txtProductoProyeccion2) {
    this.rootView = rootView;
    this.btnAddProduct = btnAddProduct;
    this.imageButton4 = imageButton4;
    this.imageButton5 = imageButton5;
    this.linearLayout = linearLayout;
    this.spinner = spinner;
    this.tbllayoutProductoListado = tbllayoutProductoListado;
    this.textView8 = textView8;
    this.txtManoObraNombre = txtManoObraNombre;
    this.txtProductoProyeccion = txtProductoProyeccion;
    this.txtProductoProyeccion2 = txtProductoProyeccion2;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFragmMateriaPrimaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFragmMateriaPrimaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_fragm_materia_prima, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFragmMateriaPrimaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_product;
      Button btnAddProduct = ViewBindings.findChildViewById(rootView, id);
      if (btnAddProduct == null) {
        break missingId;
      }

      id = R.id.imageButton4;
      ImageButton imageButton4 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton4 == null) {
        break missingId;
      }

      id = R.id.imageButton5;
      ImageButton imageButton5 = ViewBindings.findChildViewById(rootView, id);
      if (imageButton5 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.tbllayout_producto_listado;
      TableLayout tbllayoutProductoListado = ViewBindings.findChildViewById(rootView, id);
      if (tbllayoutProductoListado == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.txt_manoObra_nombre;
      EditText txtManoObraNombre = ViewBindings.findChildViewById(rootView, id);
      if (txtManoObraNombre == null) {
        break missingId;
      }

      id = R.id.txt_producto_proyeccion;
      EditText txtProductoProyeccion = ViewBindings.findChildViewById(rootView, id);
      if (txtProductoProyeccion == null) {
        break missingId;
      }

      id = R.id.txt_producto_proyeccion2;
      EditText txtProductoProyeccion2 = ViewBindings.findChildViewById(rootView, id);
      if (txtProductoProyeccion2 == null) {
        break missingId;
      }

      return new FragmentFragmMateriaPrimaBinding((FrameLayout) rootView, btnAddProduct,
          imageButton4, imageButton5, linearLayout, spinner, tbllayoutProductoListado, textView8,
          txtManoObraNombre, txtProductoProyeccion, txtProductoProyeccion2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}