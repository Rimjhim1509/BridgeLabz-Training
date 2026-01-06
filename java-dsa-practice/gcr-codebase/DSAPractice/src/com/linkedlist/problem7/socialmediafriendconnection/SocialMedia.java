package com.linkedlist.problem7.socialmediafriendconnection;
class SocialMedia {
    User head;

    // Add user
    void addUser(int id, String name, int age) {
        User newUser = new User(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Search user
    User searchUser(int id) {
        User temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection
    void addFriend(int id1, int id2) {
        User u1 = searchUser(id1);
        User u2 = searchUser(id2);

        if (u1 != null && u2 != null) {
            u1.friends[u1.friendCount++] = id2;
            u2.friends[u2.friendCount++] = id1;
        }
    }

    // Display friends
    void displayFriends(int id) {
        User u = searchUser(id);
        if (u != null) {
            System.out.print("Friends of " + u.name + ": ");
            for (int i = 0; i < u.friendCount; i++)
                System.out.print(u.friends[i] + " ");
            System.out.println();
        }
    }

    // Mutual friends
    void mutualFriends(int id1, int id2) {
        User u1 = searchUser(id1);
        User u2 = searchUser(id2);

        System.out.print("Mutual Friends: ");
        for (int i = 0; i < u1.friendCount; i++)
            for (int j = 0; j < u2.friendCount; j++)
                if (u1.friends[i] == u2.friends[j])
                    System.out.print(u1.friends[i] + " ");
        System.out.println();
    }
}
