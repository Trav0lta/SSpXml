package ua.com.owu.entity;

import javax.persistence.*;

/**
 * Created by User on 24.09.2017.
 */
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String interest;
    private String aim;




    @OneToOne(cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private User user;

    public Profile() {
    }

    public Profile(String interest, String aim, User user) {
        this.interest = interest;
        this.aim = aim;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", interest='" + interest + '\'' +
                ", aim='" + aim + '\'' +
                ", user=" + user +
                '}';
    }
}
