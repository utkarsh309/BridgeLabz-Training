package linkedList;

// Friend Node (for Friend ID list)
class FriendNode {

    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

// User Node
class UserNode {

    // User details
    int userId;
    String name;
    int age;

    // Friend list (nested linked list)
    FriendNode friendHead;

    // Next user pointer
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}

// Social Media Management Class
class SocialMedia {

    // Head of user list
    UserNode head;

    // Add new user
    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newUser;
    }

    // Find user by ID
    private UserNode findUserById(int userId) {

        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection (two-way)
    public void addFriend(int userId1, int userId2) {

        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        addFriendToList(user1, userId2);
        addFriendToList(user2, userId1);

        System.out.println("Friend connection added");
    }

    // Helper method to add friend ID
    private void addFriendToList(UserNode user, int friendId) {

        FriendNode newFriend = new FriendNode(friendId);

        if (user.friendHead == null) {
            user.friendHead = newFriend;
            return;
        }

        FriendNode temp = user.friendHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newFriend;
    }

    // Remove friend connection
    public void removeFriend(int userId1, int userId2) {

        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFriendFromList(user1, userId2);
        removeFriendFromList(user2, userId1);

        System.out.println("Friend connection removed");
    }

    // Helper method to remove friend ID
    private void removeFriendFromList(UserNode user, int friendId) {

        if (user.friendHead == null)
            return;

        if (user.friendHead.friendId == friendId) {
            user.friendHead = user.friendHead.next;
            return;
        }

        FriendNode temp = user.friendHead;
        while (temp.next != null && temp.next.friendId != friendId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display all friends of a user
    public void displayFriends(int userId) {

        UserNode user = findUserById(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");

        FriendNode temp = user.friendHead;
        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int userId1, int userId2) {

        UserNode user1 = findUserById(userId1);
        UserNode user2 = findUserById(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        boolean found = false;

        FriendNode f1 = user1.friendHead;
        while (f1 != null) {

            FriendNode f2 = user2.friendHead;
            while (f2 != null) {

                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    // Search user by name
    public void searchUserByName(String name) {

        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayUser(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    // Search user by ID
    public void searchUserById(int userId) {

        UserNode user = findUserById(userId);
        if (user != null) {
            displayUser(user);
        } else {
            System.out.println("User not found");
        }
    }

    // Count friends for each user
    public void countFriends() {

        UserNode temp = head;

        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friendHead;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // Display user details
    private void displayUser(UserNode user) {

        System.out.println("User ID: " + user.userId);
        System.out.println("Name: " + user.name);
        System.out.println("Age: " + user.age);
    }
}

// Main Class
public class SocialMediaApp {

    public static void main(String[] args) {

        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Amit", 22);
        sm.addUser(2, "Rahul", 23);
        sm.addUser(3, "Neha", 21);
        sm.addUser(4, "Priya", 22);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(2, 4);

        sm.displayFriends(1);

        sm.findMutualFriends(1, 2);

        sm.removeFriend(1, 3);

        sm.displayFriends(1);

        sm.countFriends();

        sm.searchUserByName("Neha");
    }
}
