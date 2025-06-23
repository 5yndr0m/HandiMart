package com.handimart.app.service;

import com.handimart.app.request.WishListItemRequest;
import com.handimart.app.response.WishListItemResponse;

import java.util.List;

public interface WishListItemService {
    WishListItemResponse addWishListItem(WishListItemRequest request);
    List<WishListItemResponse> getItemsByWIshListId(Long wishListId);
    String removeWishListItem(Long wishListItemId);
}
