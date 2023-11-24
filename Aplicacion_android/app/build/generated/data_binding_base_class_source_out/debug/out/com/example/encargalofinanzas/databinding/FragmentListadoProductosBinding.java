// Generated by view binder compiler. Do not edit!
package com.example.encargalofinanzas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.encargalofinanzas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentListadoProductosBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button btnAddProduct;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final TableLayout tbllayoutProductoListado;

  @NonNull
  public final EditText txtManoObraNombre;

  @NonNull
  public final EditText txtProductoProyeccion;

  private FragmentListadoProductosBinding(@NonNull FrameLayout rootView,
      @NonNull Button btnAddProduct, @NonNull LinearLayout linearLayout,
      @NonNull TableLayout tbllayoutProductoListado, @NonNull EditText txtManoObraNombre,
      @NonNull EditText txtProductoProyeccion) {
    this.rootView = rootView;
    this.btnAddProduct = btnAddProduct;
    this.linearLayout = linearLayout;
    this.tbllayoutProductoListado = tbllayoutProductoListado;
    this.txtManoObraNombre = txtManoObraNombre;
    this.txtProductoProyeccion = txtProductoProyeccion;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentListadoProductosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentListadoProductosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_listado_productos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentListadoProductosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_product;
      Button btnAddProduct = ViewBindings.findChildViewById(rootView, id);
      if (btnAddProduct == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.tbllayout_producto_listado;
      TableLayout tbllayoutProductoListado = ViewBindings.findChildViewById(rootView, id);
      if (tbllayoutProductoListado == null) {
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

      return new FragmentListadoProductosBinding((FrameLayout) rootView, btnAddProduct,
          linearLayout, tbllayoutProductoListado, txtManoObraNombre, txtProductoProyeccion);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
