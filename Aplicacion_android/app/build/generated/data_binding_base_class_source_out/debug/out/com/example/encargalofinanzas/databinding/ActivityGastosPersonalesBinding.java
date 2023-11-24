// Generated by view binder compiler. Do not edit!
package com.example.encargalofinanzas.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.encargalofinanzas.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityGastosPersonalesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnGPAgregar;

  @NonNull
  public final RadioButton radioButton;

  @NonNull
  public final RadioButton radioButton2;

  @NonNull
  public final TableLayout tbllayoutGastosPersonales;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final EditText txtGPConcepto;

  @NonNull
  public final EditText txtGPImporte;

  @NonNull
  public final TextView txtviewGPTotal;

  private ActivityGastosPersonalesBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnGPAgregar, @NonNull RadioButton radioButton,
      @NonNull RadioButton radioButton2, @NonNull TableLayout tbllayoutGastosPersonales,
      @NonNull TextView textView10, @NonNull EditText txtGPConcepto, @NonNull EditText txtGPImporte,
      @NonNull TextView txtviewGPTotal) {
    this.rootView = rootView;
    this.btnGPAgregar = btnGPAgregar;
    this.radioButton = radioButton;
    this.radioButton2 = radioButton2;
    this.tbllayoutGastosPersonales = tbllayoutGastosPersonales;
    this.textView10 = textView10;
    this.txtGPConcepto = txtGPConcepto;
    this.txtGPImporte = txtGPImporte;
    this.txtviewGPTotal = txtviewGPTotal;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGastosPersonalesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGastosPersonalesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_gastos_personales, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGastosPersonalesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_GP_agregar;
      Button btnGPAgregar = ViewBindings.findChildViewById(rootView, id);
      if (btnGPAgregar == null) {
        break missingId;
      }

      id = R.id.radioButton;
      RadioButton radioButton = ViewBindings.findChildViewById(rootView, id);
      if (radioButton == null) {
        break missingId;
      }

      id = R.id.radioButton2;
      RadioButton radioButton2 = ViewBindings.findChildViewById(rootView, id);
      if (radioButton2 == null) {
        break missingId;
      }

      id = R.id.tbllayout_gastosPersonales;
      TableLayout tbllayoutGastosPersonales = ViewBindings.findChildViewById(rootView, id);
      if (tbllayoutGastosPersonales == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.txt_GP_concepto;
      EditText txtGPConcepto = ViewBindings.findChildViewById(rootView, id);
      if (txtGPConcepto == null) {
        break missingId;
      }

      id = R.id.txt_GP_importe;
      EditText txtGPImporte = ViewBindings.findChildViewById(rootView, id);
      if (txtGPImporte == null) {
        break missingId;
      }

      id = R.id.txtview_GP_Total;
      TextView txtviewGPTotal = ViewBindings.findChildViewById(rootView, id);
      if (txtviewGPTotal == null) {
        break missingId;
      }

      return new ActivityGastosPersonalesBinding((ConstraintLayout) rootView, btnGPAgregar,
          radioButton, radioButton2, tbllayoutGastosPersonales, textView10, txtGPConcepto,
          txtGPImporte, txtviewGPTotal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
