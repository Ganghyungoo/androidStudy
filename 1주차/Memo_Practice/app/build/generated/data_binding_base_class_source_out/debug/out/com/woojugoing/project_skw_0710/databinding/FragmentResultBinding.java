// Generated by view binder compiler. Do not edit!
package com.woojugoing.project_skw_0710.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.woojugoing.project_skw_0710.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentResultBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView textViewResult1;

  @NonNull
  public final TextView textViewResult2;

  @NonNull
  public final TextView textViewResult3;

  @NonNull
  public final Toolbar toolbarResult;

  private FragmentResultBinding(@NonNull LinearLayout rootView, @NonNull TextView textViewResult1,
      @NonNull TextView textViewResult2, @NonNull TextView textViewResult3,
      @NonNull Toolbar toolbarResult) {
    this.rootView = rootView;
    this.textViewResult1 = textViewResult1;
    this.textViewResult2 = textViewResult2;
    this.textViewResult3 = textViewResult3;
    this.toolbarResult = toolbarResult;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentResultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentResultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_result, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentResultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textView_result_1;
      TextView textViewResult1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewResult1 == null) {
        break missingId;
      }

      id = R.id.textView_result_2;
      TextView textViewResult2 = ViewBindings.findChildViewById(rootView, id);
      if (textViewResult2 == null) {
        break missingId;
      }

      id = R.id.textView_result_3;
      TextView textViewResult3 = ViewBindings.findChildViewById(rootView, id);
      if (textViewResult3 == null) {
        break missingId;
      }

      id = R.id.toolbar_result;
      Toolbar toolbarResult = ViewBindings.findChildViewById(rootView, id);
      if (toolbarResult == null) {
        break missingId;
      }

      return new FragmentResultBinding((LinearLayout) rootView, textViewResult1, textViewResult2,
          textViewResult3, toolbarResult);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
