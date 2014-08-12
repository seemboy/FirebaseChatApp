package com.firebasechatapp.firebaseLogic;

import com.firebase.client.Firebase;

public class FireBaseRefs {

	private Firebase rootRef;
	private Firebase messageRef;
	private Firebase usersRef;
	
	public FireBaseRefs() {
		
	}
	
	public Firebase getRootRef() {
		return rootRef;
	}
	
	public void setRootRef(String rootUrl) {
		Firebase rootRef = new Firebase(rootUrl);
		this.rootRef = rootRef;
	}
	
	public Firebase getMessageRef() {
		return messageRef;
	}
	
	public void setMessageRef(String messageUrl) {
		Firebase messageRef = rootRef.child(messageUrl).push();
		this.messageRef = messageRef;
	}
	
	public Firebase getUsersRef() {
		return usersRef;
	}
	
	public void setUsersRef(String usersUrl) {
		Firebase usersRef = rootRef.child(usersUrl).push();
		this.usersRef = usersRef;
	}
	
	
	
}
