package com.example.materialdesign.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.materialdesign.R;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private LinkedList<String> linkedList =  new LinkedList<>(Arrays.asList("Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi", "Hell0", "Hello", "Hi"));

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.set(i, i + " \t" + linkedList.get(i));
        }
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tabbed, container, false);
        final RecyclerView recyclerView = root.findViewById(R.id.tabbed_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new CustomAdapter(linkedList.toArray(new String [0])));
        pageViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}