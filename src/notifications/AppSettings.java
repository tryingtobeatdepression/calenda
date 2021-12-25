package notifications;

import user.*;

public class AppSettings {

	private Notifier notifier;
	private User currentUser;
	private Boolean soundNotifications;

	public User getCurrentUser() {
		return this.currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

	public Boolean isSoundNotifications() {
		return soundNotifications;
	}

	public void setSoundNotifications(Boolean soundNotifications) {
		this.soundNotifications = soundNotifications;
	}

	public void notifyUser() {
		if(soundNotifications) {
			notifier = new TextNotifier("Message!");
		} else {
			notifier = new SoundNotifier();
		}
		notifier.notifyy();
	}

}