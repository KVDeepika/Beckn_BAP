package com.tibil.BecknBAP.dto.internal;

import java.util.List;

public class SelectedItems {

	private List<SelectedItem> selectedItems;

	public SelectedItems(List<SelectedItem> selectedItems) {
		super();
		this.selectedItems = selectedItems;
	}

	public List<SelectedItem> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<SelectedItem> selectedItems) {
		this.selectedItems = selectedItems;
	}
}
