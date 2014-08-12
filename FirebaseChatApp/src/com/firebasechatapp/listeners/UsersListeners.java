package com.firebasechatapp.listeners;

import org.springframework.beans.factory.annotation.Autowired;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.FirebaseError;
import com.firebasechatapp.firebaseLogic.FirebaseChatEngine;
import com.firebasechatapp.model.User;

public class UsersListeners implements ChildEventListener{

	@Autowired
	public FirebaseChatEngine firebaseChatEngine;
	@Autowired
	public User currentUser;
	
	
	@Override
	public void onCancelled(FirebaseError firebaseError) {
		
		
	}

	@Override
	public void onChildAdded(DataSnapshot snapshot, String previousChild) {
		currentUser.setUniqueId(snapshot.getName());
		System.out.println(snapshot.getName());
	}

	@Override
	public void onChildChanged(DataSnapshot snapshot, String previousChild) {
		
		
	}

	@Override
	public void onChildMoved(DataSnapshot snapshot, String previousChild) {
		
		
	}

	@Override
	public void onChildRemoved(DataSnapshot snapshot) {
		
		
	}

}
