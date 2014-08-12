package com.firebasechatapp.firebaseLogic;


import org.springframework.beans.factory.annotation.Autowired;

import com.firebasechatapp.listeners.UsersListeners;
import com.firebasechatapp.model.User;

public class FirebaseChatEngine {

	@Autowired
	public FireBaseRefs fireBaseRefs;
	@Autowired
	public UsersListeners usersListeners; 
	@Autowired
	public User currentUser;
	
	public FirebaseChatEngine() {
		
		
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public void registerUser(User user){
		fireBaseRefs.getUsersRef().push().setValue(user);
	}
	
	public void updateUserStatus(String status){
		fireBaseRefs.getUsersRef().child("");
	}
	
	
	
}
