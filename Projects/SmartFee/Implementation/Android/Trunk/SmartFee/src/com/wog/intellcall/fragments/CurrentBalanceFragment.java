package com.wog.intellcall.fragments;

import com.wog.intellcall.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CurrentBalanceFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View convertedView = inflater.inflate(R.layout.fragment_current_balance, null);
		
		return convertedView;
	}
}
